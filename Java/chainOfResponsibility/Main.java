package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // create chain of responsibility for order processing
        OrderHandler orderProcessingChain = new OrderValidationHandler(
                new PaymentProcessingHandler(
                        new OrderPreparationHandler(
                                new DeliveryAssignmentHandler(
                                        new OrderTrackingHandler(null)
                                )
                        )
                )
        );
        //Simulate an order being placed
        orderProcessingChain.processOrder("Burger");
    }
}
