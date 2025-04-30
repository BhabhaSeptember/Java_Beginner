//1.  Examine the Item class.  Pay close attention to the 
//      overloaded constructor and also the display method.
//2.  Create a new class called Shirt that inherits from Item.
//3.  Declare two private char fields: size and colorCode
//4.  Create a constructor method that takes 3 args(price, size, colorCode).  
//5.  The constructor should:
//	- Call the 2-arg constructor in the superclass, sending a String 
//            literal for the desc arg ("Shirt") and pass the price argument 
//            from this constructor. 
//	-  Assign the size and colorCode fields.

package ex12_1_exercise;

public class Item {
    private int id;
    private String desc;
    private double price;
    static int nextId = 1;
    
    public Item(){
    // set default values
        setId();
        setDesc("No description assigned.");
        setPrice(0.00);
    }
    
    public Item(String desc, double price) {
        setId();
        setDesc(desc);
        setPrice(price);
    }

    public void display(){
        System.out.println("Item description: " + getDesc());
        System.out.println("\tID: " + getId());
        System.out.println("\tPrice: R" + getPrice());
    }

    private void setId() {
        id = Item.nextId++;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    private void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }    
}
