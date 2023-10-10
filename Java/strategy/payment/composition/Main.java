package strategy.payment.composition;

import strategy.payment.composition.context.Processor;
import strategy.payment.composition.strategy.impl.CreditCardPayment;
import strategy.payment.composition.strategy.impl.CryptoPayment;
import strategy.payment.composition.strategy.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        // Payment processor
        Processor processor = new Processor();

        // payment strategy
        // select and set the payment strategy at runtime
        // composition
        processor.setPaymentStrategy(PaymentMethod.CREDIT_CARD);

        // Process the payment
        processor.processPayment(100.0);

        // Change the payment strategy
        processor.setPaymentStrategy(PaymentMethod.CRYPTO_CURRENCY);

        // Process another payment using new strategy
        processor.processPayment(50.0);

    }
}
