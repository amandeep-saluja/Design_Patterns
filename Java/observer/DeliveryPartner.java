package observer;

public class DeliveryPartner extends Observer {

    private String name;

    public DeliveryPartner(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Hi DP: "+name+ " order #"+ order.getId() +" has status: " + order.getStatus());
    }
}
