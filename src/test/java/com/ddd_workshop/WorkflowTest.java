package com.ddd_workshop;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WorkflowTest {

    @Test
    public void testWorkFlowForApplePencil() {
        Cart cart = new Cart();
        Product applePencil = new Product("Apple Pencil");
        cart.add(applePencil);
        assertFalse(cart.isEmpty());
        assertTrue(cart.size() == 1);
        List<Product> products = cart.getProducts();
        assertTrue(products.contains(new Product("Apple Pencil")));
    }

    @Test
    public void testWorkFlowForSonyHeadphones() {
        Cart cart = new Cart();
        Product applePencil = new Product("Sony Headphones");
        cart.add(applePencil);
        assertFalse(cart.isEmpty());
        assertTrue(cart.size() == 1);
        List<Product> products = cart.getProducts();
        assertTrue(products.contains(new Product("Sony Headphones")));
    }

}
