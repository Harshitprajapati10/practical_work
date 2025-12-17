// Question 10: Comprehensive Banking Application
// Develop a simple banking application with a BankAccount class that has methods for
// deposit and withdrawal. Implement the following exception handling:
// • InsufficientFundsException - thrown when withdrawal amount exceeds balance
// • InvalidAmountException - thrown for negative deposit/withdrawal amounts
// • AccountLockedException - thrown when operating on a locked account
// Create a menu-driven program to test all these scenarios.

class BankAccount {
    private double balance;
    private boolean isLocked;

    public BankAccount() {
        this.balance = 0.0;
        this.isLocked = false;
    }

    public void deposit(double amount) throws InvalidAmountException, AccountLockedException {
        if (isLocked) {
            throw new AccountLockedException("Account is locked. Cannot perform operations.");
        }
        if (amount < 0) {
            throw new InvalidAmountException("Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount)
            throws InsufficientFundsException, InvalidAmountException, AccountLockedException {
        if (isLocked) {
            throw new AccountLockedException("Account is locked. Cannot perform operations.");
        }
        if (amount < 0) {
            throw new InvalidAmountException("Withdrawal amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
    }

    public void lockAccount() {
        isLocked = true;
    }

    public void unlockAccount() {
        isLocked = false;
    }

    public double getBalance() {
        return balance;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class AccountLockedException extends Exception {
    public AccountLockedException(String message) {
        super(message);
    }
}

public class Q10BankingApp {
    public static void main(String[] args) {
        // driver code
        BankAccount account = new BankAccount();
        try {
            account.deposit(500);
            account.withdraw(200);
            account.lockAccount();
            account.withdraw(100); // This should throw AccountLockedException
        } catch (InvalidAmountException | InsufficientFundsException | AccountLockedException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
