package com.souche.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liuqizhe on 15/9/21.
 */
@Controller
@RequestMapping("/login")
@SessionAttributes("name")
public class LoginController{
    //该方法对应/login/tologin.from
    @RequestMapping("/toLogin")
    public String toLogin() {
        return "login" ;
    }
}
