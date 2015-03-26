package com.ponygame.controller;

import com.ponygame.engine.GameService;
import org.apache.log4j.Logger;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.velocity.VelocityView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class HomePageController extends AbstractGameController {
    private static final Logger LOGGER = Logger.getLogger(HomePageController.class);

    @Autowired
    private GameService gameService;

    @RequestMapping(value = "/app/**")
    public ModelAndView handleHomePage(HttpSession session, HttpServletRequest req, HttpServletResponse resp) {
        ModelAndView result = null;

        if (isLoggedIn(session)) {
            Map<String, Object> model = new HashMap<>();
            model.put("user", session.getAttribute(USER_ATTRIBUTE));
            result = new ModelAndView("templates/board", model);
        } else {
            result = new ModelAndView("forward:/app/login");
        }
        return result;
    }

}
