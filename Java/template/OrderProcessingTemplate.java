package template;

public abstract class OrderProcessingTemplate {

    public final void processOrder() {
        verifyOrder();
        assignDeliveryPartner();
        trackOrderDelivery();
    }

    protected abstract void verifyOrder();
    protected abstract void assignDeliveryPartner();
    protected abstract void trackOrderDelivery();
}
