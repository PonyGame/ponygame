package com.ponygame.model.dialogs;

public class LoginCredentialsValidationInfo {
    private final String mainMessage;
    private final String additinalInformation;

    public LoginCredentialsValidationInfo(String mainMessage, String additionalInformation) {
        this.mainMessage = mainMessage;
        this.additinalInformation = additionalInformation;
    }

    public String getMainMessage() {
        return mainMessage;
    }

    public String getAdditinalInformation() {
        return additinalInformation;
    }
}
