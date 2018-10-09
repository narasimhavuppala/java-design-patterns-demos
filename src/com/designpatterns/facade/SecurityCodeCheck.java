package com.designpatterns.facade;

public class SecurityCodeCheck {

    private int securityCode;

    public int getSecurityCode() {
        return securityCode;
    }

    public SecurityCodeCheck(int securityCode) {
        this.securityCode = securityCode;
    }

    public boolean isCodeCorrect(int secCodeToCheck) {
        return secCodeToCheck == getSecurityCode();
    }

}
