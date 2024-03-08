package app.mock;

import app.entity.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductData {
    public Map<Integer, Product> products = new HashMap<>();{
        products.put(1, new Product(1,"Milk", 10, 25.5));
        products.put(2, new Product(2,"Bread", 2, 15.0));
        products.put(3, new Product(3,"Apples", 5, 10.0));
        products.put(4, new Product(4,"Cheese", 3, 40.0));
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public Product getProduct(int id) {
        return products.get(id);
    }
}