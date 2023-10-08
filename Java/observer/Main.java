package observer;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("1", "Burger");

        Restaurant restaurant = new Restaurant("Rest 1");
        Customer customer = new Customer("Cust 1");
        DeliveryPartner deliveryPartner = new DeliveryPartner("DP 1");
        CallCenter callCenter = new CallCenter("CCE 1");

        order.registerObserver(restaurant);
        order.registerObserver(customer);
        order.registerObserver(deliveryPartner);
        order.registerObserver(callCenter);

        order.setStatus("order processing");
        System.out.println("------------------------------------");
        order.setStatus("order preparing");
        order.unregisterObserver(callCenter);
        System.out.println("------------------------------------");
        order.setStatus("order ready for pickup");
        System.out.println("------------------------------------");
        order.setStatus("order picked");
        System.out.println("------------------------------------");
        order.unregisterObserver(restaurant);
        order.setStatus("order reached");
        System.out.println("------------------------------------");
    }
}
