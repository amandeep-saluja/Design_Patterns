package observer;

public class Customer extends Observer {
    private String name;

    Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Hi Customer: "+name+ " order #"+ order.getId() +" has status: " + order.getStatus());
    }
}
