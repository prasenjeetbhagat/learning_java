
package interfaces;

import java.util.Scanner;

class PaymentService {

    private IPayment payment;

    public PaymentService(IPayment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.paymentProcess(amount);
        payment.generateReceipt();
    }
}

public class Payment_gateway {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        int choice = sc.nextInt();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        IPayment payment = null;

        switch (choice) {

            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = sc.nextLine();
                payment = new CreditCardPayment(cardNumber);
                break;

            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();
                payment = new UpiPayment(upiId);
                break;

            case 3:
                System.out.print("Enter User ID: ");
                String userId = sc.nextLine();
                payment = new NetbankingPayment(userId);
                break;

            default:
                System.out.println("Invalid Choice");
                sc.close();
                return;
        }

        PaymentService service = new PaymentService(payment);
        service.executePayment(amount);

        sc.close();
    }
}

interface IPayment {

    void paymentProcess(double amount);

    void generateReceipt();
}

class CreditCardPayment implements IPayment {

    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println(
            "Processing credit card payment of Rs: " + amount
            + " using card number: " + cardNumber
        );
    }

    @Override
    public void generateReceipt() {
        System.out.println("Credit card payment receipt generated.");
    }
}

class UpiPayment implements IPayment {

    String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println(
            "Processing UPI payment of Rs: " + amount
            + " using UPI ID: " + upiId
        );
    }

    @Override
    public void generateReceipt() {
        System.out.println("UPI payment receipt generated.");
    }
}

class NetbankingPayment implements IPayment {

    String userId;

    public NetbankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    public void paymentProcess(double amount) {
        System.out.println(
            "Processing net banking payment of Rs: " + amount
            + " using user ID: " + userId
        );
    }

    @Override
    public void generateReceipt() {
        System.out.println("Net banking payment receipt generated.");
    }
}
