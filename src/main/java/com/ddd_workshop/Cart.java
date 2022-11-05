package com.ddd_workshop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
    private final List<Product> products = new ArrayList<>();
    public void add(Product product) {
        products.add(product);
    }

    public boolean isEmpty() {
        return products.isEmpty();
    }

    public int size() {
        return products.size();
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "products=" + products +
                '}';
    }
}
