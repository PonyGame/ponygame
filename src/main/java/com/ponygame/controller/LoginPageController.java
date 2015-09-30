package com.ponygame.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginPageController {

    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String showLogin(){
        return "login";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String doLogin(){
        return "j_spring_security_check";
    }

}
