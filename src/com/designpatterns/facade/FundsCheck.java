package com.designpatterns.facade;

public class FundsCheck {

    private double cashInAccount;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public FundsCheck(double cashInAccount) {
        this.cashInAccount = cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        this.cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashWithdrawn) {
        this.cashInAccount += cashWithdrawn;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {
        if (cashToWithdrawal > getCashInAccount()) {
            System.out.println("Error: You don't have enough money");
            System.out.println("Current balance: " + getCashInAccount());
            return false;
        } else {
            decreaseCashInAccount(cashToWithdrawal);
            System.out.println("Withdrawal Complete!\n" +
                    "Current Balance is " + getCashInAccount());
            return true;
        }

    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Deposit Complete!\n" +
                "Current Balance is " + getCashInAccount());
    }

}
