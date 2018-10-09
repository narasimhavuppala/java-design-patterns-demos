package com.designpatterns.facade;

public class Main {

    public static void main(String[] args) {
	    BankAccount citiBank = new BankAccount(123456, 417417);
	    citiBank.withdrawCash(50.00);
	    citiBank.withdrawCash(990.00);
    }

}
