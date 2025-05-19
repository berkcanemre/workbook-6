package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        // Create a BankAccount with full access to all methods
        BankAccount account1 = new BankAccount(123, "Pam", 12500);

        // Create a BankAccount but reference it as a Valuable interface
        Valuable account2 = new BankAccount(456, "Gary", 1500);

        // Deposit works here because account1 is a BankAccount
        account1.deposit(100);

        // This line will cause a compile-time error because Valuable doesn't have deposit()
        // account2.deposit(100); // Uncommenting this will cause a compile error
        //we can fix this issue by writing
        // BankAccount account2 = new BankAccount(456, "Gary", 1500);
    }
}
