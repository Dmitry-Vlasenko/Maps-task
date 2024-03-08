package app.controller;

import app.entity.Product;
import app.mock.ProductData;
import app.utils.Utils;

import java.util.Scanner;

public class AppController {
    //    Text for menu
    private static final String menu = """
            --------------
            Select action:
            --------------
            1) Show all product
            2) Show product by id
            3) stop and exit
            """;

    public void Processing() {
//        Init products
        ProductData products = new ProductData();
//        Init scanner
        Scanner scanner = new Scanner(System.in);
//Work with menu
        while (true) {
            System.out.println(menu);
            System.out.print("Input your select: ");
            String action = scanner.nextLine();
            switch (action) {
//                Output all products
                case "1":
                    for (Product product : products.getProducts().values()) {
                        Utils.printProducts(product);
                    }
                    break;
//                    Output product by id
                case "2":
                    System.out.println("Write id by product");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    Product product = products.getProduct(id);
                    if (product != null) {
                        Utils.printProducts(product);
                    } else {
                        System.out.println("Product with this id was not found.");
                    }
                    break;
//                    exit
                case "3":
                    scanner.close();
                    System.out.println("By-by");
                    return;
//                    Wrong selection
                default:
                    System.out.println("Wrong selection");
                    break;
            }
        }

    }
}
