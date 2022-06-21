package Store;

import java.util.Scanner;
import java.util.ArrayList;

public class Customer {
    public String customerName;
    public static ArrayList<Product> productBought = new ArrayList<>();

    // The Customer constructor
    public Customer(String customerName) {
        this.customerName = customerName;
    }

    // The buying method for the customer
    public void addToCart(){
        System.out.println("How many items are you purchasing?");
        int number = Integer.parseInt(Main.scanner.nextLine());

        while(number<=0){
            System.out.println("You have to put in a number greater than or equal to 1!");
            System.out.println("How many items are you purchasing");
             number = Integer.parseInt(Main.scanner.nextLine());
        }
        for (int i = 0; i < number; i++){
            Product product  = new Product();

            System.out.println("Enter the name of product\n");
            product.setPname(Main.scanner.nextLine());

            System.out.println("Enter the price of Product\n");
            product.setPrice(Integer.parseInt(Main.scanner.nextLine()));

            System.out.println("Enter the quantity you are buying");
            product.setQty(Integer.parseInt(Main.scanner.nextLine()));

            productBought.add(product);
        }
    }



}


