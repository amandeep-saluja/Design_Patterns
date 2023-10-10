package strategy.payment.aggregation;

public class Processor {
    private PaymentStrategy paymentStrategy;

    public void processPayment(double amount) {
        this.paymentStrategy.processPayment(amount);
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
}
