
public class EncapsulationExample {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Prasenjeet", 1000.00);

        obj.deposit(500);
        obj.withdraw(200);
    }
}

class BankAccount {
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance after deposit: " + balance);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        }
    }
}

