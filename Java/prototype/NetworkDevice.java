package prototype;

public abstract class NetworkDevice {
    public abstract NetworkDevice clone();

    public abstract void display();

    public abstract void update(String newName);
}
