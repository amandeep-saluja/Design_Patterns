package chainOfResponsibility;

public class OrderPreparationHandler extends OrderHandler {
    public OrderPreparationHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {
        System.out.println("Preparing order: "+order);

        if(null != nextHandler) {
            this.nextHandler.processOrder(order);
        }
    }
}
