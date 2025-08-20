package com.kavya.assignment4;

public class CheckingAccount extends Account {
    private double overdraftLimit = 500;

    public CheckingAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
