package prototype;

public class Switch extends NetworkDevice {

    private String name;
    private final String protocol;

    public Switch(String name, String protocol) {
        this.name = name;
        this.protocol = protocol;
    }

    @Override
    public NetworkDevice clone() {
        return new Switch(this.name, this.protocol);
    }

    @Override
    public void display() {
        System.out.println("Switch -- Name: " + this.name + " Protocol: " + this.protocol);
    }

    @Override
    public void update(String newName) {
        this.name = newName;
    }
}
