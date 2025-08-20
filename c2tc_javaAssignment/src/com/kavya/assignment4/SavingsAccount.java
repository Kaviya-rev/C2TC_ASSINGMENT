package com.kavya.assignment4;

public class SavingsAccount extends Account {
    private double interestRate = 0.03;

    public SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
        System.out.println("Deposited " + amount + " with interest. New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
