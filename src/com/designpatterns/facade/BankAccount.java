package com.designpatterns.facade;

public class BankAccount {

    private int accountNumber;
    private int securityCode;

    AccountNumberCheck acctChecker;
    SecurityCodeCheck codeChecker;
    FundsCheck fundChecker;

    WelcomeToBank bankWelcome;

    public BankAccount(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;
        this.bankWelcome = new WelcomeToBank();
        this.acctChecker = new AccountNumberCheck(this.accountNumber);
        this.codeChecker = new SecurityCodeCheck(this.securityCode);
        this.fundChecker = new FundsCheck(1000);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void withdrawCash(double cashToGet) {
        if (acctChecker.accountActive(getAccountNumber()) && // Check if this account is active
            codeChecker.isCodeCorrect(getSecurityCode()) && // Check if this security code is correct
            fundChecker.haveEnoughMoney(cashToGet)) { // Check if this person have enough money in bank
            System.out.println("Transaction Complete\n");
        } else {
            System.out.println("Transaction Failed\n");
        }
    }

    public void depositCash(double cashToDeposit) {
        if (acctChecker.accountActive(getAccountNumber()) &&
        codeChecker.isCodeCorrect(getSecurityCode())) {
            fundChecker.makeDeposit(cashToDeposit);
            System.out.println("Transaction Complete");
        } else {
            System.out.println("Transaction Failed");
        }
    }

}
