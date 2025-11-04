package com.codegnan.oopexamples;

import java.util.Scanner;

public class Product {
    String name;
    double price;
    int quantity;

  
    public Product(String name, double price, int quantity) {
        if (name == null) {
            System.out.println("Error: Name cannot be empty");
            return;
        }

        if (price <= 0) {
            System.out.println("Error: Price must be positive");
            return;
        }

        if (quantity < 0) {
            System.out.println("Error: Quantity must be non-negative");
            return;
        }

        this.name = name;
        this.price = price;
        this.quantity = quantity;

        displayProduct();
    }

   
    public void displayProduct() {
        System.out.println("Product: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        new Product(name, price, quantity);

        sc.close();
    }
}
