package interfaces;

import java.util.Scanner;

// Abstract class
abstract class Payment {

    abstract void paymentProcess(double amount);

    abstract void generateReceipt();
}

// Payment Service
class PaymentService {

    private Payment payment;

    public PaymentService(Payment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.paymentProcess(amount);
        payment.generateReceipt();
    }
}

// Credit Card Payment
class CreditCardPayment extends Payment {

    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    void paymentProcess(double amount) {
        System.out.println(
            "Processing credit card payment of Rs: " + amount
            + " using card number: " + cardNumber
        );
    }

    @Override
    void generateReceipt() {
        System.out.println("Credit card payment receipt generated.");
    }
}

// UPI Payment
class UpiPayment extends Payment {

    String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    void paymentProcess(double amount) {
        System.out.println(
            "Processing UPI payment of Rs: " + amount
            + " using UPI ID: " + upiId
        );
    }

    @Override
    void generateReceipt() {
        System.out.println("UPI payment receipt generated.");
    }
}

// Net Banking Payment
class NetbankingPayment extends Payment {

    String userId;

    public NetbankingPayment(String userId) {
        this.userId = userId;
    }

    @Override
    void paymentProcess(double amount) {
        System.out.println(
            "Processing net banking payment of Rs: " + amount
            + " using user ID: " + userId
        );
    }

    @Override
    void generateReceipt() {
        System.out.println("Net banking payment receipt generated.");
    }
}

// Main Class
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

        Payment payment;

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