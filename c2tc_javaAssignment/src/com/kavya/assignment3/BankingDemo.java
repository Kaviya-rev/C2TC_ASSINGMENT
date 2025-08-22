package com.kavya.assignment3;

public class BankingDemo {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount(101, 1000);
        Account acc2 = new CheckingAccount(102, 2000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        Transaction t = new Transaction();
        t.performTransaction(acc1, "deposit", 500);
        t.performTransaction(acc2, "withdraw", 2500);

        System.out.println("Total Bank Accounts Created: " + Bank.getTotalAccounts());
    }
}
