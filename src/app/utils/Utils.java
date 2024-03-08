package app.utils;

import app.entity.Product;

public class Utils {

    public static void printProducts(Product product) {
        System.out.println("Id: " + product.getId() + ", Name: " + product.getName() + ", Quantity: " + product.getQuantity() + ", Price: " + product.getPrice());
    }
}