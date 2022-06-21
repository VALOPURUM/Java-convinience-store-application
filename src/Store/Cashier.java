package Store;

import java.util.Arrays;
import java.util.Scanner;

public class Cashier {
    private String cashierName;

//The cashier constructor
    public Cashier(String cashierName) {
        this.cashierName = cashierName;
    }

    // The Cashier selling method
   public static void sell(){
        System.out.println("Enter customer name: ");
       Scanner obj3 = new Scanner(System.in);
        String name = obj3.nextLine();

        System.out.println(  name + ", " +
                "here's your receipt for product(s) bought\n");
        Customer customer = new Customer(name);

        System.out.print(  "################################# \n"+
                "Thank You For your Patronage, " + customer.customerName +"! \n" +
                "RECIEPT OF PURCHASES  \n" +
                "################################# \n"+
                "################################# \n"+
                "PRODUCTS: " + Customer.productBought);


    }


}


