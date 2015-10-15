package com.ponygame.controller;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginPageController {

    @RequestMapping(value="/login")
    public ModelAndView showLogin(@RequestParam(value = "error", required = false) String error){
        ModelAndView model = new ModelAndView("login");
        if (error != null) {
            model.addObject("error", "Invalid loginname or password");
        }
        return model;
    }
}
