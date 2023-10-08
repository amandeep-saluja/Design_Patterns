package prototype;

public class Main {
    public static void main(String[] args) {
        // Prototypes
        NetworkDevice routerPrototype = new Router("Router A", "192.168.92.32", "policy");
        NetworkDevice switchPrototype = new Switch("Switch X", "Ethernet");

        // Cloning
        NetworkDevice routerClone = routerPrototype.clone();
        NetworkDevice switchClone = switchPrototype.clone();

        System.out.println("Router prototype");
        routerPrototype.display();

        System.out.println("\nSwitch prototype");
        switchPrototype.display();

        System.out.println("\nRouter clone:");
        routerClone.display();

        System.out.println("\nSwitch Clone");
        switchClone.display();

        routerClone.update("Router B");
        switchClone.update("Switch Y");

        System.out.println("\nUpdated Router Clone:");
        routerClone.display();

        System.out.println("\nUpdated Switch Clone:");
        switchClone.display();
    }
}
