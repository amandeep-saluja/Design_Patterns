package template;

public class InternationalOrderProcessing extends OrderProcessingTemplate {
    @Override
    protected void verifyOrder() {
        System.out.println("International: Verify Order");
    }

    @Override
    protected void assignDeliveryPartner() {
        System.out.println("International: Assign Delivery Partner");
    }

    @Override
    protected void trackOrderDelivery() {
        System.out.println("International: Track Order Delivery");
    }
}
