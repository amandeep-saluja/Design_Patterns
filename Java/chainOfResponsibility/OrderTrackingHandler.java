package chainOfResponsibility;

public class OrderTrackingHandler extends OrderHandler {
    public OrderTrackingHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {
        System.out.println("Order tracking: "+order);

        if(null != nextHandler) {
            this.nextHandler.processOrder(order);
        }
    }
}
