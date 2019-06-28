package com.ultrapower.service;

import com.ultrapower.dao.AmUserMapper;
import com.ultrapower.dto.AmUserRueryVO;
import com.ultrapower.pojo.AmUser;
import com.ultrapower.pojo.AmUserExample;
import com.ultrapower.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service
public class AmUserserviceimpl implements AmUserservice {

    @Autowired
    AmUserMapper amUserMapper;

    @Autowired
    RedisTemplate redisTemplate;
    /**
     * 用户登录校验
     * @param user
     * @return
     */
    public AmUserRueryVO amUserLogin(AmUser user, HttpServletResponse response) {
            AmUserRueryVO amUserRueryVO = new AmUserRueryVO();
            // 1,登录成功    2，用户名不存在   3，密码错误
            AmUserExample amUserExample = new AmUserExample();
            AmUserExample.Criteria criteria = amUserExample.createCriteria();
            criteria.andUserAccountEqualTo(user.getUserAccount());
            List<AmUser> amUsers = amUserMapper.selectByExample(amUserExample);
            if (amUsers == null || amUsers.size() == 0) {
                amUserRueryVO.setCode(2);
                amUserRueryVO.setMsg("用户名不存在");
                amUserRueryVO.setUser(user);
            } else {
                criteria.andUserAccountEqualTo(user.getUserPassword());
                List<AmUser> list = amUserMapper.selectByExample(amUserExample);
                if (list.size() > 0 && list != null) {
                    amUserRueryVO.setCode(1);
                    amUserRueryVO.setMsg("登录成功");
                    amUserRueryVO.setUser(list.get(0));

                    //登录成功后创建一个Cookie
                    String uuid = PkUtils.getPrimaryKey();
                    Cookie cookie = new Cookie("token",uuid);
                    cookie.setMaxAge(-1);
                    cookie.setPath("/");
                    response.addCookie(cookie);
                    //保持用户ID和用户名
                    Cookie pkNsmpUser = new Cookie("pkNsmpUser",amUserRueryVO.getUser().getPkNsmpUser());
                    pkNsmpUser.setMaxAge(-1);
                    pkNsmpUser.setPath("/");
                    response.addCookie(pkNsmpUser);
                    Cookie userAccount = new Cookie("userAccount",amUserRueryVO.getUser().getUserAccount());
                    userAccount.setMaxAge(-1);
                    userAccount.setPath("/");
                    response.addCookie(userAccount);

                    String key="token"+uuid;
                    redisTemplate.boundHashOps("session").put(key,amUserRueryVO.getUser().getPkNsmpUser());
                } else {
                    amUserRueryVO.setCode(3);
                    amUserRueryVO.setMsg("密码错误");
                    amUserRueryVO.setUser(user);
                }
            }
            return amUserRueryVO;
    }
}

