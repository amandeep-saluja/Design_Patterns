package observer;

public class CallCenter extends Observer {
    private String name;

    public CallCenter(String name) {
        this.name = name;
    }

    @Override
    public void update(Order order) {
        System.out.println("Hi customer execution: "+name+ " order #"+ order.getId() +" has status: " + order.getStatus());
    }
}
