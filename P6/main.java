import java.util.*;

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class Account {
    static String bankName = "ABC Bank";
    static int count = 0;
    final int accountNumber;
    String name;
    double balance;

    Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        count++;
    }

    static void showCount() {
        System.out.println("Total Accounts: " + count);
    }

    final void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0)
            throw new InvalidAmountException("Invalid deposit amount");
        balance += amount;
    }

    void withdraw(double amount) throws InvalidAmountException {
        if (amount <= 0)
            throw new InvalidAmountException("Invalid withdrawal amount");
        if (amount > balance)
            throw new InvalidAmountException("Insufficient balance");
        balance -= amount;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Account a = new Account(101, "Ram", 5000);
            a.deposit(2000);
            a.withdraw(1000);
            a.display();
            a.withdraw(10000);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
            Account.showCount();
        }
    }
}
