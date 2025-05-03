/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
public class Lesson13 {

    public static void main(String[] args) {
//EXAMPLE1 (CALLING THE TOSTRING METHOD)
//        System.out.println(new Object()); //returns name of class & hashvalue
//        System.out.println(new StringBuilder("Testing toString method in StringBuilder object")); //overrides Objects toString method
//        System.out.println(new First()); //does not override Objects toString method
//        System.out.println(new Second()); //contains an overridden toString method so that one is called
//
//
//
//EXAMPLE2 (OVERRIDING TOSTRING METHOD IN SHIRT CLASS)
//1)
//Shirt myShirt1 = new Shirt();
//System.out.println(myShirt1);//without overriding toString method, the inherited Object class toString method is used
//
//2)
//Shirt myShirt2 = new Shirt("V-Neck", 69.99, 'G'); 
//System.out.println(myShirt2);
//
//
//
//EXAMPLE3 (INTERFACES - REFER TO SHIRT & RETURNABLE CLASSES)
//1)IMPLEMENTING THE RETURNABLE INTERFACE
//        Shirt shirt01 = new Shirt();
//        System.out.println(shirt01.doReturn());
//
//
//
//2)ACCESS TO OBJECT METHODS FROM THE INTERFACE
//Clothing c1 = new Trousers(1, "Trousers-Clothing", 109.99, 'S', 'R', 'F'); //has access to Clothing methods
//Trousers t1 = new Trousers(2, "Trousers-Trousers", 250, 'M', 'R', 'F'); //has access to Trousers & Clothing methods
//Returnable r1 = new Trousers(3, "Returnable-Trousers,", 279.99, 'L', 'R', 'F'); //has accesst to Returnable methods

//CLOTHING METHODS TEST
//c1.getID();
//t1.getID();
//r1.getID();//error occurs because interface does not have access to Clothing methods
//TROUSERS METHODS TEST
//c1.getGender();//error occurs, object is of type Clothing which does not have access to Trousers type methods
//t1.getGender();
//r1.getGender();//error occurs, object does not have access to Trousers type methods
//RETURNABLE METHODS TEST
//c1.doReturn();//error occurs, Clothing class does not implement Returnable interface therefore does not have access to Returnable interface methods
//t1.doReturn();
//r1.doReturn();
////
//
//CASTING AN INTERFACE REFERENCE
//((Trousers) c1).getGender();//casting to Trousers type gives object access to Trousers methods
//((Trousers) r1).getGender();
//
//
//
//=============================================== * TODO : GO-OVER THIS AGAIN FOR BETTER UNDERSTANDING * ============================================================
//EXAMPLE4 (USING THE LIST INTERFACE)
//1)
//        String[] nums = {"one", "two", "three"};
//        List<String> myList = Arrays.asList(nums); //ArrayList implements List interface 
//        System.out.println("String Array called nums: " + Arrays.toString(nums));
//        System.out.println("String List called myList: " + myList);
//
//
//2)CONVERTING AN ARRAY TO AN ARRAYLIST
//        ArrayList<String> myArrayList = new ArrayList(Arrays.asList(nums));
//        System.out.println("String ArrayList called myArrayList: " + myArrayList);
//    
//
//
//=============================================== * END OF TODO * ============================================================
//
//EXAMPLE5 (INTRO TO LAMBDA EXPRESSIONS)
//1)MODIFYING A LIST OF NAMES
        String[] names = {"Bhabha", "Ned", "Fred", "Jessie", "Alice", "Rick"};
        List<String> myList = new ArrayList(Arrays.asList(names));

//toUpperCase() method below prints the names out in uppercase but does not change the actual list element values themselves
//Note: String objects are immutable, in the example below, we create a new String with uppercase element values...
//...then we reassign reference to point to new String. we do not actually change the values in place
        for (String s : myList) {
            System.out.println(s.toUpperCase() + ", ");
        }
        System.out.println("After for loop: " + myList);
//
//
//
//2)USING LAMBDA EXPRESSION WITH REPLACEALL
//lambda expressions are concrete methods for an interface, expressed in a new way
//a)
myList.replaceAll((String s) -> {
    return s.toUpperCase();
}); //long version of lambda expressions
//b)
myList.replaceAll(s -> s.toUpperCase()); //short version of lambda expression
System.out.println("List.replaceAll labmda: " + myList);
//
//
//3)THE UNARYOPERATOR LAMBDA TYPE
//has single input and returns value of same type as input
//e.g) myList.replaceAll(s -> s.toUpperCase() );
//
//4)THE PREDICATE LAMBDA TYPE
//takes a single input and returns a boolean
//e.g)
myList.removeIf(s -> s.equalsIgnoreCase("Rick"));
        System.out.println("After removing Rick: " + myList);
myList.removeIf (s -> s.length() < 5);
        System.out.println("After removing string less than 5 char: " + myList);







    }//end of main method

}//end of Lesson13 class

//============================================ FIRST TEST CLASS ============================================ 
class First {
}

//============================================ SECOND TEST CLASS ============================================ 
class Second {

    public String string = "Second Test Class String";

    @Override
    public String toString() {
        System.out.println("Inside Second Test Class toString method");
        return string;
    }

}//end of Second Test Class

//============================================ CLOTHING CLASS ============================================ 
class Clothing {

    public int itemID;
    public String desc;
    public double price;
    public char size;
    public char colorCode;

    public Clothing() {
    }

    public Clothing(int itemID, String desc, double price, char size, char colorCode) {
        this.itemID = itemID;
        this.desc = desc;
        this.price = price;
        this.size = size;
        this.colorCode = colorCode;
    }

    public void display() {
        System.out.println("===== CLOTHING DETAILS ===\n"
                + "ItemID: " + itemID
                + "Description: " + desc
                + "Price: R" + price
                + "Size: " + size
                + "Color Code: " + colorCode);
    }//end of display method

    public int getID() {
        return itemID;
    }

    public char getSize() {
        return size;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }

    public char getColorCode() {
        return colorCode;
    }

    @Override
    public String toString() {
        return "This shirt is a " + desc + ";\n Price = R"
                + getPrice() + ",\n Color Code = " + getColorCode();

    }
}//end of Clothing class

//============================================ SHIRT CLASS ============================================ 
class Shirt extends Clothing implements Printable, Returnable {

    public Shirt() {
    }

    public Shirt(int itemID, String desc, double price, char size, char colorCode) {
        super(itemID, desc, price, size, colorCode);
    }

    @Override
    public void print() {
        System.out.println("Shirt description"); //implementing the interfaces abstract method
    }

    @Override
    public String doReturn() {
        return "Shirt returns done within 3 days";
    }

}//end of Shirt class

//============================================ TROUSERS CLASS ============================================ 
class Trousers extends Clothing implements Returnable {

    public char gender;

    public Trousers() {
    }

    public Trousers(int itemID, String desc, double price, char size, char colorCode, char gender) {
        super(itemID, desc, price, size, colorCode);
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String doReturn() {
        return "Trouser returns done within 5 days";
    }

}//end of Trousers class

//============================================ PRINTABLE INTERFACE ============================================ 
interface Printable {
//methods in interfaces dont have method blocks, they end with a semi-colon
//a class which implements the interface will implement the method as well
//the methods are implicitly abstract and must be implemented by classes that implement the interface
//there are also default methods    

    public void print();
}

//============================================ RETURNABLE INTERFACE ============================================ 
interface Returnable {

    public String doReturn();
}
