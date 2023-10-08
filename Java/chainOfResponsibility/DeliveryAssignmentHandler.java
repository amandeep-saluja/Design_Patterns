package chainOfResponsibility;

public class DeliveryAssignmentHandler extends OrderHandler {
    public DeliveryAssignmentHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder(String order) {
        System.out.println("Assigning delivery for order: "+order);

        if(null != this.nextHandler) {
            this.nextHandler.processOrder(order);
        }
    }
}
