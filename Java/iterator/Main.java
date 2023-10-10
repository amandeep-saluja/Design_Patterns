package iterator;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Stove", 3200.32);
        Product product2 = new Product("Books", 4390.2);
        Product product3 = new Product("Fan", 5687.232);

        Inventory inventory = new Inventory();
        inventory.getProducts().add(product1);
        inventory.getProducts().add(product2);
        inventory.getProducts().add(product3);

        Iterator productIterator = inventory.createIterator();

        System.out.println("First: " + productIterator.first() + "\n");

        while (productIterator.hasNext()) {
            System.out.println(productIterator.next());
        }
    }
}
