package strategy.payment.aggregation;

public class Main {
    public static void main(String[] args) {
        // Payment processor
        Processor processor = new Processor();

        // payment strategy
        // select and set the payment strategy at runtime
        // aggregation
        PaymentStrategy strategy = new CreditCardPayment();
        processor.setPaymentStrategy(strategy);

        // Process the payment
        processor.processPayment(100.0);

        // Change the payment strategy
        strategy = new CryptoPayment();
        processor.setPaymentStrategy(strategy);

        // Process another payment using new strategy
        processor.processPayment(50.0);

    }
}
