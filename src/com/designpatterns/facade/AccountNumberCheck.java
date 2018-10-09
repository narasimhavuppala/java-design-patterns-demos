package com.designpatterns.facade;

public class AccountNumberCheck {
    private int accountNumber;

    public int getAccountNumber() {
        return accountNumber;
    }

    public AccountNumberCheck(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean accountActive(int acctNumToCheck) {
        return acctNumToCheck == getAccountNumber();
    }
}
