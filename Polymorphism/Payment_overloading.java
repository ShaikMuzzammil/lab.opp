class PaymentProcessor {
    // Overloaded methods for different payment scenarios
    void processPayment(double amount) {
        System.out.printf("Processing payment of %.2f through default method.%n", amount);
    }

    void processPayment(double amount, String paymentMethod) {
        System.out.printf("Processing payment of %.2f through %s.%n", amount, paymentMethod);
    }

    void processPayment(double amount, String paymentMethod, String currency) {
        System.out.printf("Processing payment of %.2f through %s in %s currency.%n", amount, paymentMethod, currency);
    }
}

public class Paymentoverloading {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Polymorphism in action: invoking overloaded methods
        processor.processPayment(100.00); // Default
        processor.processPayment(250.00, "Credit Card"); // Payment method
        processor.processPayment(500.00, "PayPal", "USD"); // Method and currency
    }
}
