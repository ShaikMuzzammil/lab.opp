class BankAccount {
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited: $%.2f | New Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrew: $%.2f | Remaining Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds!");
        }
    }
}

public class Encapsulation_1 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 5000);
        
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());
        
        account.deposit(1500);
        account.withdraw(2000);
        
        // Update account holder name
        account.setAccountHolder("Jane Doe");
        System.out.println("Updated Account Holder: " + account.getAccountHolder());
    }
}