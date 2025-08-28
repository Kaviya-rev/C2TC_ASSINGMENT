package userdefined_exception;

// Custom exception for insufficient funds
public class Exception extends Banking {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for invalid deposit/withdrawal amount
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
