//In the ShoppingCart class:
//1.  Code the displayTotal method.  Use a standard for loop to 
//      iterate through the items array.
//2.  If the current item is out of stock (call isOutOfStock method of 
//      the item), skip to the next loop iteration.
//3.  If it is not out of stock, add the item price to a total variable 
//      that you declare and initialize prior to the for loop.
//4.  Print the Shopping Cart total with a suitable label.


package ex11_3_exercise;

public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60), 
                    new Item("WristBand",0), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }//end of main method
    
    // Use a standard for loop to iterate through the items array, adding up the total price
    //    Skip any items that are back ordered.  Display the Shopping Cart total.
    public void displayTotal(){
        double total = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isBackOrdered()) {
                continue;  //skips back ordered items
            } else {
                total = total + items[i].getPrice();
            }
            System.out.println("Total is: R" + total);
        }
    }//end of displayTotal method
    
}//end of Shopping Cart Class
