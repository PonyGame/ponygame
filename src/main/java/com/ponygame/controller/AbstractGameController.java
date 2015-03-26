package com.ponygame.controller;

import javax.servlet.http.HttpSession;

public class AbstractGameController {
    public static final String USER_NAME_PARAMETER = "user-name";
    public static final String USER_PASSWORD_PARAMETER = "user-password";
    public static final String USER_ATTRIBUTE = "user";

    protected boolean isLoggedIn(HttpSession session) {
        return session.getAttribute(USER_ATTRIBUTE) != null;
    }
}
