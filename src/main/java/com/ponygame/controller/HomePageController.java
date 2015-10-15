package com.ponygame.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
    private static final Logger LOGGER = Logger.getLogger(HomePageController.class);

    @Value("${url.login.path}")
    private String loginUrl;

    @Value("${url.new.room.options}")
    private String newRoomOptionsUrl;

    @RequestMapping(value = "${url.root}**")
    public ModelAndView handleHomePage() {
        return new ModelAndView("index");
    }
}
