/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_1_exercise;

/**
 *
 * @author User
 */
public class ShoppingCart {
//1. Declare a boolean, outOfStock, and initialize it to true.
//2. Use an if statement to test the value of quantity.  
//    If it is > 1, concatenate an 's' to message so that it indicates multiple items.
//3. Use an if | else statement that tests the value of outOfStock.
//    If true, let the user know the item is unavailable.
//    If false, print the message variable, then print the total cost with tax.
//4. Run with outOfStock = true and then again with outOfStock = false.

    public static void main(String[] args) {
        String custName = "Mary Anne";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = custName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        // Declare outOfStock variable and initialize
//        boolean outOfStock = true;
        boolean outOfStock = false;
        

        // Test quantity and modify message if quantity > 1. 
        if (quantity > 1) {
            message = message + "s";
        }

        // Test outOfStock and notify user in either case.
        if (outOfStock) {
            System.out.println("Sorry, the " + itemDesc + "s are out of stock");
        } else {
            System.out.println(message);
            System.out.println("Total cost is: R" + total);
        }

    }

}
