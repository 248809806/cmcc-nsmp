package com.ultrapower.service;

import com.ultrapower.dto.AmUserRueryVO;
import com.ultrapower.pojo.AmUser;

import javax.servlet.http.HttpServletResponse;

public interface AmUserservice {

    /**
     * 用户登录
     * @param user
     * @return
     */
    public AmUserRueryVO amUserLogin(AmUser user, HttpServletResponse response);
}
