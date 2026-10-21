import java.util.*;
public class BankAccount {
 
    private String accountHolder;
    private double balance;

  
    public BankAccount() {
        this.accountHolder = "Unknown";
        this.balance = 0.0;
    }

  
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        setBalance(initialBalance); // Uses validation
    }

 
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Balance cannot be negative! Setting to 0.0");
            this.balance = 0.0;
        }
    }

    public static void main(String[] args) {
     
        BankAccount acc1 = new BankAccount();
        System.out.println("Account 1: " + acc1.getAccountHolder() + ", Balance: ₹" + acc1.getBalance());

      
        BankAccount acc2 = new BankAccount("Ram", 500.0);
        System.out.println("Account 2: " + acc2.getAccountHolder() + ", Balance: ₹" + acc2.getBalance());

        
        BankAccount acc3 = new BankAccount("Shyam", -100.0);
        System.out.println("Account 3: " + acc3.getAccountHolder() + ", Balance: ₹" + acc3.getBalance());
    }
}

