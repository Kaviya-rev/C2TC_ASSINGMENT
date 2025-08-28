package userdefined_exception;
	import banking.exceptions.InsufficientFundsException;
	import banking.exceptions.InvalidAmountException;

	// BankAccount class simulating a simple banking system
	public class Banking {
	    private int accountNumber;
	    private double balance;

	    // Parameterized constructor to initialize account number and balance
	    public BankAccount(int accountNumber, double balance) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	    }

	    // Deposit money into the account
	    public void deposit(double amount) throws InvalidAmountException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Deposit amount must be positive.");
	        }
	        balance += amount;
	        System.out.println("Deposited: " + amount);
	    }

	    // Withdraw money from the account
	    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
	        if (amount <= 0) {
	            throw new InvalidAmountException("Withdrawal amount must be positive.");
	        }
	        if (amount > balance) {
	            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
	        }
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	    }

	    // Display account balance
	    public void displayBalance() {
	        System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
