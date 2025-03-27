package ex06_2_exercise;
//1. Declare and instantiate 2 objects of type Item. Initialize only 
//     the descr field in each, using different values for each.
//2. Print the description for each item and run the code.
//3. (Optional) Above the code that prints the descriptions, 
//     assign item2 to item1.  Run it again.

public class ShoppingCart {

    public static void main(String args[]) {
        // Declare and initialize 2 Item objects
        Item item1 = new Item();
        Item item2 = new Item();

        item1.desc = "Shirt";
        item2.desc = "Socks";

// Print both item descriptions and run code.
        System.out.println("Original item1: " + item1.desc);
        System.out.println("Original item2: " + item2.desc);

        // Assign one item to another and run it again.
        item1 = item2;
        System.out.println("\nUpdated item1: " + item1.desc);
        System.out.println("Updated item2: " + item2.desc);
    }

}
