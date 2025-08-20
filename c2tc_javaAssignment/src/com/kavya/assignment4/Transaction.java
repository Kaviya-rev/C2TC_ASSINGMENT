package com.kavya.assignment4;

public final class Transaction {
    private final double transactionFee = 10.0;

    public final void performTransaction(Account account, String type, double amount) {
        System.out.println("\n--- Transaction Started ---");
        
        switch (type.toLowerCase()) {
            case "deposit":
                account.deposit(amount);
                break;
            case "withdraw":
                account.withdraw(amount);
                break;
            default:
                System.out.println("Invalid Transaction Type!");
                return;
        }

        account.withdraw(transactionFee);
        System.out.println("Transaction Fee of " + transactionFee + " applied.");
        System.out.println("Balance after Transaction: " + account.getBalance());
        System.out.println("--- Transaction Completed ---\n");
    }
}
