package strategy.payment.composition.factory;

import strategy.payment.composition.PaymentMethod;
import strategy.payment.composition.strategy.impl.CreditCardPayment;
import strategy.payment.composition.strategy.impl.CryptoPayment;
import strategy.payment.composition.strategy.impl.PayPalPayment;
import strategy.payment.composition.strategy.PaymentStrategy;

public class PaymentStrategyFactory {
    public static PaymentStrategy createPaymentStrategy(PaymentMethod method) {
        if(PaymentMethod.CREDIT_CARD.toString().equals(method.toString())) {
            return new CreditCardPayment();
        }
        else if(PaymentMethod.PAYPAL.toString().equals(method.toString())) {
            return new PayPalPayment();
        }
        else {
            return new CryptoPayment();
        }
    }
}
