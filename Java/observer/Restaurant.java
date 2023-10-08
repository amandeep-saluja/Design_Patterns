package observer;

public class Restaurant extends Observer {

    private final String name;

    public Restaurant(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Hi Restaurant: " + name + " order #" + order.getId() + " has status: " + order.getStatus());
    }
}
