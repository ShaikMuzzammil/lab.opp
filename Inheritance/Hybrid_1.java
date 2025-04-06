interface OnlinePayment {
    void processOnlinePayment(double amount);
}

interface CashPayment {
    void processCashPayment(double amount);
}

class Payment {
    void paymentDetails(double amount) {
        System.out.printf("Payment Amount: %.2f%n", amount);
    }
}

class PaymentGateway extends Payment implements OnlinePayment, CashPayment {
    public void processOnlinePayment(double amount) {
        System.out.println("Processing online payment...");
        paymentDetails(amount);
        System.out.println("Payment processed via credit card.");
    }

    public void processCashPayment(double amount) {
        System.out.println("Processing cash payment...");
        paymentDetails(amount);
        System.out.println("Payment received in cash.");
    }
}

public class Hybrid_1 {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();
        System.out.println("--- Online Payment ---");
        gateway.processOnlinePayment(1500);
        System.out.println("--- Cash Payment ---");
        gateway.processCashPayment(500);
    }
}