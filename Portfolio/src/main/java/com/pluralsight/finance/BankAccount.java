package com.pluralsight.finance;

// BankAccount implements Valuable
public class BankAccount implements Valuable {
    private String name; // Owner's name
    private String accountNumber; // Account number
    private double balance; // Current balance

    // Constructor
    public BankAccount(int accountNumber, String name, double balance) {
        this.accountNumber = String.valueOf(accountNumber);
        this.name = name;
        this.balance = balance;
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
    }

    // Withdraw money
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Implement getValue from Valuable interface
    @Override
    public double getValue() {
        return balance;
    }
}
