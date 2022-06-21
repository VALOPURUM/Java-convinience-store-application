package Store;
import java.util.ArrayList;
import java.util.Scanner;


public class Manager {

    static ArrayList<Cashier> cashierList = new ArrayList<Cashier>();

    static void hireCashier(Cashier cashier){

        System.out.print("Enter name of cashier you wish to hire:");
        Scanner obj4 = new Scanner(System.in);
        String name_cashier = obj4.nextLine();

        cashierList.add(cashier);
        System.out.println("You have successfully hired " + name_cashier+ " as a new cashier");
    }

    public static void main(String[] args){
        Manager manager = new Manager();
        Cashier newCashier = new Cashier("Ada");
        manager.hireCashier(newCashier);

    }
}
