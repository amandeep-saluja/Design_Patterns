package template;

public class Main {
    public static void main(String[] args) {
        OrderProcessingTemplate localOrderProcessing = new LocalOrderProcessor();
        localOrderProcessing.processOrder();

        OrderProcessingTemplate internationalOrderProcessing = new InternationalOrderProcessing();
        internationalOrderProcessing.processOrder();
    }
}
