/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson08;

/**
 *
 * @author User
 */
public class Lesson08 {

    public static void main(String[] args) {

//EXAMPLE1: REFER TO SHIRT CLASS BELOW MAIN METHOD 
//
//Shirt myShirt = new Shirt();
//myShirt.display(); //calling a method from a different class
//System.out.println("myShirt: " + myShirt);
//
// BETTER CODE WITH METHODS
//SYNTAX1: 
//Shirt shirt01 = new Shirt();
//Shirt shirt02 = new Shirt();
//Shirt shirt03 = new Shirt();
//Shirt shirt04 = new Shirt();
//shirt01.setFields("V-Neck", 'B', 129.99);
//shirt02.setFields("Sweatshirt", 'G', 350);
//shirt03.setFields("Golf-T", 'W', 150);
//shirt04.setFields("Round-Neck", 'Y', 129.99);


//SYNTAX2: SEE FIRST CONSTRUCTOR BELOW
Shirt shirt01 = new Shirt("V-Neck", "Blue", 129.99);
Shirt shirt02 = new Shirt("Sweatshirt", "Green", 350);
Shirt shirt03 = new Shirt("Golf-T", "White", 150);
Shirt shirt04 = new Shirt("Round-Neck", "Yellow", 129.99);
shirt01.display();
shirt02.display();
shirt03.display();
shirt04.display();



//EXAMPLE2: REFER TO CALCULATOR CLASS BELOW MAIN METHOD
//Calculator calc = new Calculator();
//calc.calculate(6, 4); //arguments are values passed in during method cal
//calc.calculate0();
//calc.calculate1(7);
//calc.calculate3(10, 7, 20);


//EXAMPLE3: REFER TO METHOD RETURN TYPE EXAMPLES BELOW
//methodReturnTypes example = new methodReturnTypes();
//
//example.printString();
//System.out.println(example.returnString());
//System.out.println(example.sum(4,5));
//System.out.println(example.isGreater(4,7));


//EXAMPLE4: REFER TO SHOPPINGCART & CUSTOMER CLASSES BELOW
//ShoppingCart shopcart = new ShoppingCart();
//shopcart.setCustomerServices();

    } //end of main method   
} //end of lesson08 class

//-------------------------- SHIRT CLASS -----------------------------------------
class Shirt {
//      FIELDS or instance variables (accessible from any code from within the shirt class) - stored in longterm heap memory
    public String description;
    public char colorCode;
    public double price;

//CONSTRUCTORS
//(1)
public Shirt(String desc, String color, double price) {
    setFields(desc, price);
    setColor(color);
}    
//(2)
//public Shirt() {} //default class constructor. it is implied even when not explicitly typed out
//(3)
    public Shirt() {
        description = "--- description required ---";
        colorCode = 'U';
        price = 0.00;

// // example1: (calling method normally) 
//display();
// // example2: (calling method in same class)    
//this.display();
    } //end of Shirt class constructor

//BASIC FORM OF A METHOD
    public void display() {
        System.out.println("\n===== SHIRT DETAILS =====");
        System.out.println("- Shirt description: " + description);
        System.out.println("- Color code: " + colorCode);
        System.out.println("- Price: R" + price);
    } //end of display method in Shirt class

// Override toString method
    @Override
    public String toString() {
        return "\n- Shirt Description: " + description
                + "\n- Price: R" + price
                + "\n- Color: " + colorCode;
    }
    
//BETTER CODE WITH METHODS
//EXAMPLE1:     
//    public void setFields(String desc, char color, double price) {
//        this.description = desc;
//        this.colorCode = color;
//        this.price = price;
//        System.out.println( "\n======== SHIRT DETAILS ========" +
//                "\nDescription: " + desc +
//                "\nColor Code: " + color +
//                "\nPrice: R" + price);
//    }
//EXAMPLE2: SEE FIRST CONSTRUCTOR ABOVE
 public void setFields(String desc, double price) {
        this.description = desc;
        this.price = price;
} 
public void setColor (String theColor) { //the color is local variable (accessible from within the method only) -stored in short term stack memory
    if (theColor.length() > 0) {
        colorCode = theColor.charAt(0);
    }
}
}//end of Shirt class

//------------------------------------- CALCULATOR CLASS ------------------------------------------
class Calculator {

    int x; //numerator
    double y; //denominator;

//METHOD PARAMETER EXAMPLES:
//EXAMPLE1:    
    public void calculate(int x, double y) { //parameters are values defined in method declaration
        System.out.println("1) " + x + " / " + y + " = " + (x / y));
    }

//EXAMPLE2:
    public void calculate0() {
        System.out.println("2) No parameters");
    }

//EXAMPLE3:
    public void calculate1(int x) {
        System.out.println("3) " + x + " / 2.0 = " + (x / 2.0));
    }

//EXAMPLE$:
    public void calculate3(int x, double y, int z) {
        System.out.println("4) " + x + " / " + y + " + " + z + " = " + (x / y + z));
    }

} //end of Calculator class

//---------------------------- METHOD RETURN TYPES CLASS ---------------------------------------
class methodReturnTypes {

    public void printString() { //void methods do not return values
        System.out.println("Hello");
    }

    public String returnString() { //methods must return data that matches their return type
        return ("Hello");
    }

    public int sum(int x, int y) {
        return (x + y);
    }

    public boolean isGreater(int x, int y) {
        return (x > y);
    }

} //end of methodReturnTypes class

//-------------------------- CUSTOMER CLASS -----------------------------------------------------
class Customer {
//    field
    public boolean isNew = true;

//methods
    public boolean isNewCustomer() {
        return isNew;
    }

    public void sendEmail(String message) {
        System.out.println("Sending email: \n" + message);
    }
    
} //end of Customer class


//-------------------------- SHOPPING CART CLASS -----------------------------------------------------

class ShoppingCart {
    
    Customer cust = new Customer();
    
    public void setCustomerServices() {
        String message = "Would you like to hear about special deals in your area?";
        if (cust.isNewCustomer()) {
            cust.sendEmail(message);
        }
    }   
}

