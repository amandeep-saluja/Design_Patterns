package template;

public class LocalOrderProcessor extends OrderProcessingTemplate {
    @Override
    protected void verifyOrder() {
        System.out.println("Local: Verify Order");
    }

    @Override
    protected void assignDeliveryPartner() {
        System.out.println("Local: Assign Delivery Partner");
    }

    @Override
    protected void trackOrderDelivery() {
        System.out.println("Local: Track Order Delivery");
    }
}
