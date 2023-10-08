package prototype;

public class Router extends NetworkDevice {

    private String name;
    private final String ip;
    private final String securityPolicy;

    public Router(String name, String ip, String securityPolicy) {
        this.name = name;
        this.ip = ip;
        this.securityPolicy = securityPolicy;
    }

    @Override
    public NetworkDevice clone() {
        return new Router(this.name, this.ip, this.securityPolicy);
    }

    @Override
    public void display() {
        System.out.println("Router -- Name: " + name + " IP: " + ip + " Security Policy: " + securityPolicy);
    }

    @Override
    public void update(String newName) {
        this.name = newName;
    }
}
