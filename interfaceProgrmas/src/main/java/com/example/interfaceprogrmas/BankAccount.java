package com.example.interfaceprogrmas;

public class BankAccount implements Measurable {
    private double balance;
    private int accountNumber;
    private static int LastAssigneNumber = 1000;

    public BankAccount(double balance) {
        this.balance = balance;
        LastAssigneNumber++;
        accountNumber = LastAssigneNumber;

    }

    public double getMeasure() {
        return balance;
    }

}
