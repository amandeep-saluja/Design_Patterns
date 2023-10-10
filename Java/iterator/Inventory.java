package iterator;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final List<Product> products = new ArrayList<>();

    public Iterator createIterator() {
        return new ProductIterator(products);
    }

    public List<Product> getProducts() {
        return products;
    }
}
