package chainOfResponsibility;

public class PaymentProcessingHandler extends OrderHandler {
    public PaymentProcessingHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {
        System.out.println("Payment processing for order: "+order);

        if(null != nextHandler) {
            this.nextHandler.processOrder(order);
        }
    }
}
