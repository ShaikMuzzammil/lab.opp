import java.util.Scanner;

abstract class Payment {
    private String paymentType;

    
    public Payment(String paymentType) {
        this.paymentType = paymentType;
    }

        abstract void processPayment(double amount);

       public static void displayPaymentMethods() {
        System.out.println("Available Payment Methods:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
    }

    public String getPaymentType() {
        return paymentType;
    }
}

class CreditCardPayment extends Payment {
    public CreditCardPayment() {
        super("Credit Card");
    }

    @Override
    void processPayment(double amount) {
        System.out.printf("Paid $%.2f using %s.%n", amount, getPaymentType());
    }
}

class PayPalPayment extends Payment {
    public PayPalPayment() {
        super("PayPal");
    }

    @Override
    void processPayment(double amount) {
        System.out.printf("Paid $%.2f using %s.%n", amount, getPaymentType());
    }
}

public class Abstract_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Payment.displayPaymentMethods();         System.out.print("Enter Payment Method (credit/paypal): ");
        String paymentMethod = sc.nextLine();
        
        System.out.print("Enter Payment Amount: ");
        double amount = sc.nextDouble();
        
        Payment payment;
        if (paymentMethod.equalsIgnoreCase("credit")) {
            payment = new CreditCardPayment();
        } else {
            payment = new PayPalPayment();
        }
        
        payment.processPayment(amount);
        sc.close();     }
}