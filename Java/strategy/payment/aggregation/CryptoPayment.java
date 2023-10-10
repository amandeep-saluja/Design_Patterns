package strategy.payment.aggregation;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Crypto Payment of $" + amount);
    }
}
