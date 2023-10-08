package chainOfResponsibility;

public class OrderValidationHandler extends OrderHandler {
    public OrderValidationHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {
        System.out.println("Validating order: " + order);
        //perform order validation logic here

        if(null != nextHandler) {
            this.nextHandler.processOrder(order);
        }
    }
}
