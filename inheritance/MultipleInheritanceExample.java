
public class MultipleInheritanceExample {
    public static void main(String[] args) {

        SmartAccount obj = new SmartAccount();

        obj.accountHolderName = "Rahul";
        obj.balance = 1000;

        obj.deposit(500);
        obj.applyLoan(2000);
    }
}

interface AccountOperation {
    void deposit(double amount);
}

interface LoanOperation {
    void applyLoan(double amount);
}

class SmartAccount implements AccountOperation, LoanOperation {
    String accountHolderName;
    double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount
                + ", New Balance: " + balance);
    }

    @Override
    public void applyLoan(double amount) {
        balance += amount;
        System.out.println("Loan approved: " + amount
                + ", New Balance: " + balance);
    }
}
