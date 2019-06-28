package com.ultrapower.web;

import com.ultrapower.dto.AmUserRueryVO;
import com.ultrapower.pojo.AmUser;
import com.ultrapower.service.AmUserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class AmUserControler {

    @Autowired
    AmUserservice amUserservice;

    /**
     * 用户登录校验
     * @param user
     * @return
     */
    @PostMapping("/amUserLogin")
    public AmUserRueryVO amUserLogin(AmUser user, HttpServletResponse response){
        AmUserRueryVO amUserRueryVO = amUserservice.amUserLogin(user,response);
        return amUserRueryVO;
    }
}
