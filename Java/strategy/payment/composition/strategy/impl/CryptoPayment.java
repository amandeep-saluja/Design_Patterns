package strategy.payment.composition.strategy.impl;

import strategy.payment.composition.strategy.PaymentStrategy;

public class CryptoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Crypto Payment of $" + amount);
    }
}
