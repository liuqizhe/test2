package com.souche.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        System.out.println("run toLogin");
        return "login" ;
    }

    @RequestMapping("login3")
    public String checkLogin3(User user, ModelMap map) {
        //检查用户名和密码，假设用户名scott，密码123456
        System.out.println("run checkLogin3");
        if("scott".equals(user.getUsername()) && "123456".equals(user.getPassword())) {
            map.addAttribute("user", user.getUsername()) ;
            return "ok" ;
        } else {
            return "login" ;
        }
    }

    @ModelAttribute("name")
    public User getUser() {//早于SessionAttribute
        return new User() ;
    }
}
