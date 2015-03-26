package com.ponygame.model;

public class UserImpl implements User {
    private String firstName = DEFAULT_FIRST_NAME;
    private String secondName = DEFAULT_SECOND_NAME;
    private String login;
    private String password;

    public UserImpl(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public UserImpl(String firstName, String secondName, String login, String password) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.login = login;
        this.password = password;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getSecondName() {
        return null;
    }

    @Override
    public String getLogin() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String toString() {
        return "UserImpl{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
