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
//SUMMARY:
//Creates an instance of the Shirt class
//Create a new Shirt object and assign it to the variable myShirt
//Calls the display() method of the Shirt class. Prints or shows details about the shirt
//It then prints the myShirt object, which will call the toString() method if it's overridden in the Shirt class
// If not, it will print the object's memory. In our case the toString method is overridden to give a string representation of the object
Shirt myShirt = new Shirt();
myShirt.display(); //calling a method from a different class
System.out.println("myShirt: " + myShirt);
//
// BETTER CODE WITH METHODS
//SYNTAX1: 
//SUMMARY:
//Four Shirt objects (shirt01 to shirt04) are created using the Shirt class constructor
//Each shirt object has its attributes set using the setFields method with parameters
//The setFields method assigns these values to instance variables such as description, colorCode, and price inside the Shirt class
Shirt shirt01 = new Shirt();
Shirt shirt02 = new Shirt();
Shirt shirt03 = new Shirt();
Shirt shirt04 = new Shirt();
shirt01.setFields("V-Neck", 'B', 129.99);
shirt02.setFields("Sweatshirt", 'G', 350);
shirt03.setFields("Golf-T", 'W', 150);
shirt04.setFields("Round-Neck", 'Y', 129.99);
//
//
//SYNTAX2: SEE FIRST CONSTRUCTOR BELOW
//SUMMARY:
//Four Shirt objects (shirt05 to shirt08) are created using a constructor that takes parameters:
//String for description, String for color name, double for price 
//The display() method is then called on each object to output its details
Shirt shirt05 = new Shirt("V-Neck", "Blue", 129.99);
Shirt shirt06 = new Shirt("Sweatshirt", "Green", 350);
Shirt shirt07 = new Shirt("Golf-T", "White", 150);
Shirt shirt08 = new Shirt("Round-Neck", "Yellow", 129.99);
shirt05.display();
shirt06.display();
shirt07.display();
shirt08.display();
//
//
//
//EXAMPLE2: REFER TO CALCULATOR CLASS BELOW MAIN METHOD
//SUMMARY:
//This code creates an object of the Calculator class and calls several methods on it with different arguments
//Create a new instance of the Calculator class
//Call the calculate method with two arguments: 6 and 4
//Call the calculate method with no arguments
//Call the calculate method with one argument: 7
//Call the calculate method with three arguments: 10, 7, and 20
//This code demonstrates method overloading — multiple methods with the same names but different parameter lists
//Each method performs a different calculation or operation based on the number/type of arguments passed
Calculator calc = new Calculator();
calc.calculate(6, 4); //arguments are values passed in during method cal
calc.calculate();
calc.calculate(7);
calc.calculate(10, 7, 20);
//
//
//
//EXAMPLE3: REFER TO METHOD RETURN TYPE EXAMPLES BELOW
//SUMMARY:
//An object example of the class methodReturnTypes is created. Four method calls are made on this object:
//The code demonstrates calling different types of methods in a class, including those that:
//Return no value (void), Return a string, Return an integer sum and Return a boolean comparison result   
methodReturnTypes example = new methodReturnTypes();
//
example.printString();
example.returnString();
System.out.println(example.returnString());

example.sum(4, 5);
System.out.println(example.sum(4,5));

example.isGreater(4, 7);
System.out.println(example.isGreater(4,7));
//
//
//
//EXAMPLE4: REFER TO SHOPPINGCART & CUSTOMER CLASSES BELOW
ShoppingCart shopcart = new ShoppingCart();
shopcart.setCustomerServices();
//
//
//
//EXAMPLE5: REFER TO ITEM SIZES & ITEM CLASSES BELOW
//
//1)Accessing static variable and method using an instance of that where they were defined class
//SUMMARY:
//Demonstrates how to access static variables and methods in Java using the class name. Object instance is not necessary
//ItemSizes.mSmall: Accesses the static variable mSmall directly from the ItemSizes class
//ItemSizes.setMSmall(): Calls the static method setMSmall() directly from the class.
//To show that static members (variables and methods) can and should be accessed using the class name 
//without needing to create an object of the class.
System.out.println("Variable: " + ItemSizes.mSmall);
System.out.println("Method: " + ItemSizes.setMSmall());
//
//
//2) Accessing static variable from another class
//SUMMARY:
//This code demonstrates how to access a static variable from another class and use it with an instance of the Item class.
//Create an Item object. Calls the setSize() method on item1, passing in the static variable ItemSizes.mMed from the ItemSizes class
//Prints the size of item1
//To show how a static variable (mMed) from the ItemSizes class can be used without creating an instance of ItemSizes
//and passed into a method of another class (Item) to set a value
Item item1 = new Item();
item1.setSize(ItemSizes.mMed); //item object calling static variable from the ItemSizes class
        System.out.println("Item1 Size: " + item1.size); 
// 
//
//3) Accessing static method from another class
//SUMMARY:
//This code shows how to access a static method from another class and use its returned value with an instance of the Item class
//Creates an Item object. 
//Calls the static method ItemSizes.setMSmall() from the ItemSizes class to get a size string.
//Passes that returned string to the setSize() method of the item2 object
//Prints the size of item2
//To demonstrate how a static method from one class can be called directly
//using the class name to provide data used by an instance method of another class
Item item2 = new Item();       
item2.setSize(ItemSizes.setMSmall()); //accessing static method from another class
System.out.println("Item2 Size: "  + item2.size);
//
//
//
//
//
//NOTES
//Instance methods can access static methods or fields
//instance methods & variables are only available by referencing individual object instances
//Static methods cannot access instance methods or fields
//static methods do not need an object reference in order to be invoked 
//
//
//
//EXAMPLE5 (REFER TO STATIC METHOD BELOW )
//example1:
//When invoking a method, args values are used to initialize the params variables before body is executed
        Shirt myShirt2 = new Shirt();
        System.out.println("My Shirt color: " + myShirt2.colorCode); //output = My Shirt color: U
        changeShirtColor(myShirt2, 'B'); 
        System.out.println("My Shirt color2: " + myShirt2.colorCode); //output = My Shirt color: B

//example2:
//when calling method it references theShirt and not myShirt hence no change reflected in below output
        Shirt myShirt3 = new Shirt();
        System.out.println("My Shirt color: " + myShirt3.colorCode); //output = My Shirt color: U
        changeShirtColor2(myShirt3, 'B'); 
        System.out.println("My Shirt color2: " + myShirt3.colorCode); //output = My Shirt color: U
//
//
//
//EXAMPLE6 (REFER TO CALCULATOR2 CLASS BELOW)
Calculator2 calcTest = new Calculator2();

int totalOne = calcTest.sum(2, 3);
        System.out.println("Total = " + totalOne);
        System.out.println("========================");
float totalTwo = calcTest.sum(15.99F, 12.85F);
        System.out.println("Total = " + totalTwo); 
        System.out.println("========================");

float totalThree = calcTest.sum(2, 12.85F);
        System.out.println("Total = " + totalThree);
        System.out.println("========================");
        
    } //end of main method  

//example1:
//SUMMARY:    
//This is a static method named changeShirtColor that takes two parameters: 
//theShirt: an object of the Shirt class and color: a char representing a new color code
//Changes the colorCode property of the given Shirt object to the specified color
//Purpose is to modify the color of a Shirt object by directly updating its colorCode field using a static method    
    public static void changeShirtColor (Shirt theShirt, char color) {
        theShirt.colorCode = color;
    }
    
//example2:    
    public static void changeShirtColor2(Shirt theShirt, char color) { //method parameter points to a theShirt object created below
        theShirt = new Shirt(); //here the reference value passed to method is this new theShirt 
        theShirt.colorCode = color;
        System.out.println("The Shirt color: " + theShirt.colorCode);
    }
} //end of lesson08 class

//-------------------------- SHIRT CLASS -----------------------------------------
class Shirt {
//      FIELDS or instance variables (accessible from any code from within the shirt class) - stored in longterm heap memory

    public String description;
    public char colorCode;
    public double price;

//CONSTRUCTORS
//(1)
//SUMMARY:
//This is a constructor for the Shirt class that takes three parameters:   
//desc (shirt description), color (shirt color as a string), price (shirt price as a double)
//Calls two methods: setFields(desc, price) which sets the description and price. and..
//setColor(color) which sets the color using the color name     
    public Shirt(String desc, String color, double price) {
        setFields(desc, price);
        setColor(color);
    }
//
//    
//(2)
//public Shirt() {} //default class constructor. it is implied even when not explicitly typed out
//
//    
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
//SUMMARY:
//This is a display method in the Shirt class that: Prints the shirt's details to the console in a formatted way
//Displays three key properties: Description (description), Color code (colorCode), Price (price)      
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
//SUMMARY:
//This is a method named setFields defined in a Shirt class  
//Takes three parameters: desc (a String for the shirt's description), color (a char representing a color code) and 
//price (a double for the shirt's price)
//Assigns these parameters to the object's instance variables using this
//Prints the shirt's details to the console in a formatted way    
    public void setFields(String desc, char color, double price) {
        this.description = desc;
        this.colorCode = color;
        this.price = price;
        System.out.println( "\n======== SHIRT DETAILS ========" +
                "\nDescription: " + desc +
                "\nColor Code: " + color +
                "\nPrice: R" + price);
    }
//    
//    
//EXAMPLE2: SEE FIRST CONSTRUCTOR ABOVE
//SUMMARY:    
//This is a setter method named setFields that takes two parameters:    
//desc (a String for the shirt's description), price (a double for the shirt's price)
//Assigns these values to the object's instance variables: this.description = desc; and this.price = price;    
    public void setFields(String desc, double price) {
        this.description = desc;
        this.price = price;
    }

//SUMMARY:    
//This is a method named setColor that takes a String parameter called theColor (a local variable stored in stack memory)  
//Checks if the string is not empty (theColor.length() > 0)
//If not empty, it sets the first character of the string (theColor.charAt(0)) as the value of the instance variable colorCode    
    public void setColor(String theColor) { //the color is local variable (accessible from within the method only) -stored in short term stack memory
        if (theColor.length() > 0) {
            colorCode = theColor.charAt(0); //assign first letter to instance variable
        }
    }
}//end of Shirt class

//------------------------------------- CALCULATOR CLASSES ------------------------------------------
class Calculator {

    int x; //numerator
    double y; //denominator;

//METHOD PARAMETER EXAMPLES:
//EXAMPLE1:
//SUMMARY:    
//This is a method named calculate that takes two parameters: x (an integer), y (a double)
//Performs division of x by y then prints the result   
    public void calculate(int x, double y) { //parameters are values defined in method declaration
        System.out.println("1) " + x + " / " + y + " = " + (x / y));
    }

//EXAMPLE2:
//SUMMARY:    
//This is a method named calculate that takes no parameters but imply prints a message
    public void calculate() {
        System.out.println("2) No parameters");
    }

//EXAMPLE3:
//SUMMARY:    
//This is a method named calculate that takes one integer parameter x  
//Divides x by 2.0 (a double) then prints the result    
    public void calculate(int x) {
        System.out.println("3) " + x + " / 2.0 = " + (x / 2.0));
    }

//EXAMPLE4:
//SUMMARY:    
//This is a method named calculate that takes three parameters: x (an integer), y (a double), z (an integer)
//Performs the calculation: (x / y) + z then prints the result    
    public void calculate(int x, double y, int z) {
        System.out.println("4) " + x + " / " + y + " + " + z + " = " + (x / y + z));
    }

} //end of first Calculator class

//------------------------------------------------------
//demonstrating method overloading
//i.e method with same name but different signatures(name, number, types & order of params)
final class Calculator2 {
    public static int sum(int num1, int num2) {
        System.out.println("Method One");
        return num1 + num2;
    }
    
    public static float sum(float num1, float num2) {
        System.out.println("Method Two");
        return num1 + num2;
    }
    
    public static float sum(int num1, float num2) {
        System.out.println("Method Three");
        return num1 + num2;
    }
    
} //end of second calculator class

//---------------------------- METHOD RETURN TYPES CLASS ---------------------------------------
class methodReturnTypes {

//SUMMARY:
//This is a void method named printString that: Takes no parameters, Prints the message "Hello" to the console.   
    public void printString() { //void methods do not return values
        System.out.println("Hello");
    }

//SUMMARY:    
//This is a method named returnString that: Takes no parameters   
//Returns a String value — specifically, "Hello"    
    public String returnString() { //methods must return data that matches their return type
        return ("Hello");
    }

//SUMMARY:    
//This is a method named sum that: Takes two integer parameters: x and y  
//Returns the sum of the two integers    
    public int sum(int x, int y) {
        return (x + y);
    }

//SUMMARY:
//This is a method named isGreater that: Takes two integer parameters: x and y
//Returns true if x is greater than y, otherwise returns false    
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
//SUMMARY:
//This is a class named **ShoppingCart** that: 
//Creates an instance of the **Customer** class (cust)
//Has a method called **setCustomerServices** that:
//Defines a message about special deals. 
//Checks if the customer is new by calling cust.isNewCustomer()
//If the customer is new, it sends the message via email using cust.sendEmail(message)
//Purpose is to offer special deals to new customers by checking their status and sending them an email if applicable
//This demonstrates interaction between classes (ShoppingCart and Customer).
class ShoppingCart {

    Customer cust = new Customer();

    public void setCustomerServices() {
        String message = "Would you like to hear about special deals in your area?";
        if (cust.isNewCustomer()) {
            cust.sendEmail(message);
        }
    }

    
}

//-------------------------- ITEM SIZES CLASS -----------------------------------------------------
//SUMMARY: 
//This is a class named ItemSizes that defines two static final variables:
//mSmall and mMed, representing size labels like "Men's Small" and "Men's Medium"
//These are constants and can be accessed without creating an object of the class.
//Includes a static method setMSmall() that returns the string "Men's Small".
//Purpose: To provide predefined size values and a method to retrieve one of them, 
//all accessible statically, meaning no instance of ItemSizes is required.
class ItemSizes {

    static final String mSmall = "Men's Small"; //static variables may be used without instantiating an ItemSizes object
    static final String mMed = "Men's Medium";

    static String setMSmall() { //creating a static method
        return ("Men's Small");
    }

}


//----------------------------- ITEM CLASS -----------------------------------------------------
//SUMMARY:
//This is a class named Item that: 
//Has a public instance variable size of type String
//Contains a method setSize(String sizeArg) that sets the value of size using the provided argument sizeArg
//Purpose: To represent an item with a size property and provide a method to set or update its size.
class Item {

    public String size;

    public void setSize(String sizeArg) {
        this.size = sizeArg;
    }
}
