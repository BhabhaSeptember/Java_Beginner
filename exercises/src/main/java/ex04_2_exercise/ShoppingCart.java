/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_2_exercise;

/**
 *
 * @author User
 */
public class ShoppingCart {
//1. Declare and initialize numeric fields. Include price and tax (double), 
//     quantity (int). Also declare a double called total, but do not initialize it.
//2. Change the message variable to include quantity 
//      (example: "Mary Smith wants to purchase 1 Shirt.")
//3. Calculate total by multiplying price * quantity * tax.
//4. Print a message showing the total cost. 
//      (example:  "Total cost with tax is: 25.78.") 

    public static void main(String[] args) {
        String custName = "Mary Anne";
        String itemDesc = "Shirt";

        // Declare and initialize numeric fields: price, tax, quantity, and total.   
        double price = 25.50, tax = 7, total;
        int quant = 5;

        // Modify message to include quantity 
        String message = custName + " wants to purchase: " + quant + " " + itemDesc + "'s";

        // Calculate total and then print the total cost
        total = price * quant * tax;
        System.out.println(message);
        System.out.println("Total cost with tax is R" + total);
        
    }
}
