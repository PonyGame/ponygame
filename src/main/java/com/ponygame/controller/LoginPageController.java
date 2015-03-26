package com.ponygame.controller;

import com.ponygame.model.User;
import com.ponygame.model.UserImpl;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.velocity.VelocityView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class LoginPageController extends AbstractGameController {

    @RequestMapping(value = "/login/**")
    public ModelAndView loginHandle(HttpSession session, HttpServletRequest req, HttpServletResponse resp) {
        String viewPath = "redirect:/app";

        if (!isLoggedIn(session)) {
            if (validateInputLoginCredentials(req)) {
                User newUser = new UserImpl(req.getParameter(USER_NAME_PARAMETER), req.getParameter(USER_PASSWORD_PARAMETER));
                session.setAttribute(USER_ATTRIBUTE, newUser);
            } else {
                viewPath = "templates/login";
            }
        }
        return new ModelAndView(viewPath);
    }

    private boolean validateInputLoginCredentials(HttpServletRequest req) {
        String userName = req.getParameter(USER_NAME_PARAMETER);
        String userPassword = req.getParameter(USER_PASSWORD_PARAMETER);
        return (!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(userPassword));
    }
}
