package strategy.payment.composition.strategy.impl;

import strategy.payment.composition.strategy.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}
