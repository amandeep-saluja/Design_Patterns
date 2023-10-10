package iterator;

import java.util.List;

public class ProductIterator implements Iterator {

    private List<Product> products;

    private int current;

    public ProductIterator(List<Product> products) {
        this.products = products;
        this.current = 0;
    }

    @Override
    public Product first() {
        current = 0;
        if(null != products && !products.isEmpty()) {
            return products.get(current);
        }
        return null;
    }

    @Override
    public Product next() {
        if(hasNext()) {
            return products.get(current++);
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return !products.isEmpty() && products.size() > current;
    }
}
