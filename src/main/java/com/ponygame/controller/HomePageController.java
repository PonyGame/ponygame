package com.ponygame.controller;

import com.ponygame.engine.GameService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomePageController {
    private static Logger LOGGER = Logger.getLogger(HomePageController.class);

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/homepage")
    public ModelAndView handleHomePage(HttpServletRequest req, HttpServletResponse resp) {
        return new ModelAndView("templates/homePage");
    }

    @RequestMapping(value = "/homepage/startgame", method = RequestMethod.GET)
    public ModelAndView handleAjaxStartGameRequest(HttpServletRequest req, HttpServletResponse resp) {
        return new ModelAndView("homePage");
    }
}
