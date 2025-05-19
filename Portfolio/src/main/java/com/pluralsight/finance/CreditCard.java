package com.pluralsight.finance;

// CreditCard implements Valuable
public class CreditCard implements Valuable {
    private String name; // Cardholder's name
    private String accountNumber; // Card number
    private double balance; // Balance owed (debt)

    // Constructor
    public CreditCard(int accountNumber, String name, double balance) {
        this.accountNumber = String.valueOf(accountNumber);
        this.name = name;
        this.balance = balance;
    }

    // Charge the card
    public void charge(double amount) {
        balance += amount;
    }

    // Pay off the card
    public void pay(double amount) {
        balance -= amount;
    }

    // Implement getValue from Valuable
    @Override
    public double getValue() {
        return -balance; // Liability reduces net value
    }
}
