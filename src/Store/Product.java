package Store;

public class Product {
    //properties
    private String pname;
    private int qty;
    private double price;
    private double totalPrice;


    public void setPname(String pname) {
        this.pname = pname;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //get methods
    public String getPname(){
    return pname;
    }

    public int getQty(){
        return qty;
    }

    public double getPrice(){
        return price;
    }

    public double getTotalPrice(){
        return this.price * this.qty;
    }
    public String toString(){
        return "Product name: = " + this.getPname() + "  " + " total Price: " + this.getTotalPrice();
    }
}
