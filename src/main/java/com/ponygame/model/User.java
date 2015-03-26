package com.ponygame.model;

public interface User {
    static final String DEFAULT_FIRST_NAME = "Anonymous";
    static final String DEFAULT_SECOND_NAME = "Anonymous";

    String getFirstName();

    String getSecondName();

    String getLogin();

    String getPassword();
}
