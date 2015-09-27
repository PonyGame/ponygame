package com.ponygame.controller;

import com.ponygame.model.UserImpl;
import com.ponygame.model.dialogs.LoginCredentialsValidationInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginPageController extends AbstractGameController {

    private final static String LOGIN_VIEW_PATH = "login";

    @Value("${url.root}")
    private String urlRoot;

    @RequestMapping(value = "${url.login}", method = RequestMethod.GET)
    public ModelAndView loginPage(HttpServletRequest req) {
        return new ModelAndView(isLoggedIn(req.getSession()) ? REDIRECT_PREFIX + urlRoot : LOGIN_VIEW_PATH);
    }

    @RequestMapping(value = "${url.login}", method = RequestMethod.POST)
    public ModelAndView checkCredentials(HttpServletRequest req) {
        ModelAndView modelAndView = new ModelAndView();
        String userName = req.getParameter(USER_NAME_PARAMETER);
        String userPassword = req.getParameter(USER_PASSWORD_PARAMETER);

        if (isCredentialsValid(userName, userPassword)) {
            req.getSession().setAttribute(USER_ATTRIBUTE, new UserImpl(userName, userPassword));
            modelAndView.setViewName(REDIRECT_PREFIX + urlRoot);
        } else {
            modelAndView.setViewName(LOGIN_VIEW_PATH);
            modelAndView.addObject("loginCredentialsInfo",
                    new LoginCredentialsValidationInfo(
                            "Login credentials are not correct!",
                            "Here is some additional info"));
        }
        return modelAndView;
    }

    private boolean isCredentialsValid(String userName, String userPassword) {
        return (!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(userPassword));
    }
}
