package strategy.payment.composition.context;

import strategy.payment.composition.PaymentMethod;
import strategy.payment.composition.factory.PaymentStrategyFactory;
import strategy.payment.composition.strategy.PaymentStrategy;

public class Processor {
    private PaymentStrategy paymentStrategy;

    public void processPayment(double amount) {
        this.paymentStrategy.processPayment(amount);
    }

    public void setPaymentStrategy(PaymentMethod method) {
        if(this.paymentStrategy!=null) {
            // Releasing the object for garbage collection -> deleting -> Composition
            this.paymentStrategy = null;
        }
        // Creating new strategy object
        this.paymentStrategy = PaymentStrategyFactory.createPaymentStrategy(method);
    }
}
