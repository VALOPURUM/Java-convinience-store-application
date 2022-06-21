package Store;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {//Manager hiring cashier
         //Manager hires Cashier
        Cashier newCashier = new Cashier("Ada");
        Manager.hireCashier(newCashier);

        //Customer buys
        Customer customer1 = new Customer("James");
        customer1.addToCart();

        //Cashier sells
        newCashier.sell();




    }

}
