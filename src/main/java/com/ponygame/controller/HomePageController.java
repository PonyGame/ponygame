package com.ponygame.controller;

import com.ponygame.engine.GameService;
import com.ponygame.velocity.JsVelocityHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @Autowired
    private JsVelocityHelper jsVelocityHelper;

    @Value("${url.login.path}")
    private String loginUrl;

    @Value("${url.new.room.options}")
    private String newRoomOptionsUrl;

    @RequestMapping(value = "${url.root}/**")
    public ModelAndView handleHomePage(HttpSession session, HttpServletRequest req, HttpServletResponse resp) {
        ModelAndView result = null;

        if (isLoggedIn(session)) {
            Map<String, Object> model = new HashMap<>();
            model.put("user", session.getAttribute(USER_ATTRIBUTE));
            //model.put("newRoomOptionsUrl", jsVelocityHelper.)
            result = new ModelAndView("board", model);
        } else {
            result = new ModelAndView(REDIRECT_PREFIX + loginUrl);
        }
        return result;
    }

}
