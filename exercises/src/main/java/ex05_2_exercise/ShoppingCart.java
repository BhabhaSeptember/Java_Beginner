/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_2_exercise;

/**
 *
 * @author User
 */
//1. Declare a String array and initialize it with 4 elements.
//     Each element represents a different item description ("Shirt", for instance).
//2. Change message to show how many items the customer wants to purchase 
//     (Use the length property of the items array).
//3. Print just one element of the items array.  
//     What happens if you use index number 4?
public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "John Smith";
        

        //Declare and initialize the items String array
        String[] items = {"Vest", "Jacket", "Sock", "Shoe"};

        // Change message to show the number of items purchased.
        String message = custName + " wants to purchase " + items.length + " items.";
        System.out.println(message);
        
        // Print an element from the items array.  
        System.out.println("One of those items is a " + items[0]);
    }
}
