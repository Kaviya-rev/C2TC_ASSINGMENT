package userdefined_exception;
import banking.account.BankAccount;
import banking.exceptions.InsufficientFundsException;
import banking.exceptions.InvalidAmountException;

		public class Main {
		    public static void main(String[] args) {
		        // Create BankAccount object
		        Banking account = new Banking(101, 5000);

		        // Display initial balance
		        account.displayBalance();

		        // Deposit operations with exception handling
		        try {
		            account.deposit(2000);  // Valid deposit
		            account.deposit(-500);  // Invalid deposit, triggers exception
		        } catch (InvalidAmountException e) {
		            System.out.println("Deposit Error: " + e.getMessage());
		        } finally {
		            System.out.println("Deposit operation attempted.\n");
		        }

		        // Withdrawal operations with exception handling
		        try {
		            account.withdraw(1000); // Valid withdrawal
		            account.withdraw(7000); // Insufficient funds, triggers exception
		        } catch (InvalidAmountException | InsufficientFundsException e) {
		            System.out.println("Withdrawal Error: " + e.getMessage());
		        } finally {
		            System.out.println("Withdrawal operation attempted.\n");
		        }

		        // Display final balance
		        account.displayBalance();
		    }
		}


	}

}
