package com.mcw;

import java.util.*;

public class Cart {
    List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }
}
