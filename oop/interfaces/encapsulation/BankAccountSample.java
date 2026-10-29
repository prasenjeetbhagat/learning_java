
class Account {

    // 1. Private variables
    private double accountno;
    private double accountpin;
    private double balance;

    // 2. Constructor
    public Account(double accountno, double accountpin, double balance) {
        this.accountno = accountno;
        this.accountpin = accountpin;
        this.balance = balance;
    }

    // 3. Getter methods
    public double getAccountno() {
        return accountno;
    }

    public double getAccountpin() {
        return accountpin;
    }

    public double getBalance() {
        return balance;
    }

    // 4. Setter methods
    public void setAccountno(double accountno) {
        this.accountno = accountno;
    }

    public void setAccountpin(double accountpin) {
        this.accountpin = accountpin;
    }

    // 5. Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // 6. Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance");
        }
    }
}

public class BankAccountSample {
    public static void main(String[] args) {

        // Creating an object using the constructor
        Account obj = new Account(12345, 1234, 5000);

        // Getter methods
        System.out.println("Account Number: " + obj.getAccountno());
        System.out.println("Account PIN: " + obj.getAccountpin());
        System.out.println("Balance: " + obj.getBalance());

        // Deposit
        obj.deposit(1000);

        // Withdraw
        obj.withdraw(2000);
    }
}

