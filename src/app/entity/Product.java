package app.entity;

public class Product {

    private final String name;
    private final int quantity;
    private final double price;
    private final int id;

    public Product(int id, String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    public int getId() {
        return id;
    }
}