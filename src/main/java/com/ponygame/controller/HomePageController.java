package com.ponygame.controller;

import com.ponygame.model.Room;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@Controller
public class HomePageController {
    private static Logger LOGGER = Logger.getLogger(HomePageController.class);

    @RequestMapping(value = "/homepage")
    public ModelAndView handleHomePage(HttpServletRequest req, HttpServletResponse resp) {
        LOGGER.debug("Handling request query: " + req.getQueryString());
        ModelAndView result = new ModelAndView("homePageTemplate");
        return result;
    }
}
