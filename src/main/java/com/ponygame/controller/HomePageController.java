package com.ponygame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.velocity.VelocityView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomePageController {

    @RequestMapping(value = "/test")
    @ResponseBody
    public ModelAndView handleHomePage(HttpServletRequest req, HttpServletResponse resp) {
        return new ModelAndView("classes/blabla.vtl");
    }


}
