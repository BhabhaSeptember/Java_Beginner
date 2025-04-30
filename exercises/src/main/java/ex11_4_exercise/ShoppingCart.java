//1. In the main method of ShoppingCart, declare, instantiate, 
//     and initialize at least 3 elements in an ArrayList of Strings.  
//2. Print the ArrayList and run it to test your code.  
//3. Fix the error by adding an import statement.
//3. Use the add method to add a new element somewhere in the 
//     middle of the list.  Hint: use the overloaded add method that takes
//     an index number as one of the arguments. 
//4. Print the list again to see the affect.
//5. Test for a particular value in the ArrayList and remove it 
//     if it exists, remove it. 
//     Hint: Use the contains method.  It returns a boolean 
//     and takes a single argument as the search criteria.
//6. Print the list again.
package ex11_4_exercise;

import java.util.ArrayList;

public class ShoppingCart {

    public static void main(String[] args) {
        // Declare, instantiate, and initialize an ArrayList of Strings.  Print and test your code.
        ArrayList<String> items;
        items = new ArrayList();
        items.add("Golf Shirt");
        items.add("Pencil Skirt");
        items.add("Leather Jacket");
        System.out.println("1. " + items);

        // add (insert) another element at a specific index
        items.add(2, "Heels");
        System.out.println("2. " + items);

        // Check for the existence of a specific String element.  
        //   If it exists, remove it.
        if (items.contains("Golf Shirt")) {
            items.remove("Golf Shirt");
            System.out.println("3. " + items);
        }
    }
}
