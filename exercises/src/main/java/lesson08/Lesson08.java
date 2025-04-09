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
        
Shirt myShirt = new Shirt();
myShirt.display();
        
    }
    
}




class Shirt {
//      FIELDS
    public String description;
    public char colorCode;
    public double price;
    
//      CONSTRUCTORS
    //public Shirt() {} //default class constructor. it is implied even when not explicitly typed out

    public Shirt() {
        description = "--- description required ---";
        colorCode = 'U';
        price = 0.00;
    }
    
     
//        BASIC FORM OF A METHOD
public void display() {
    System.out.println("Shirt description: " + description);
    System.out.println("Color code: " + colorCode);
    System.out.println("Shirt price: R"+ price);
}
}



