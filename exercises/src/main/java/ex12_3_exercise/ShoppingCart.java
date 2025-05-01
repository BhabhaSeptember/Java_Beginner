//In the ShoppingCart class:
//3.  Declare and instantiate a Shirt object using an Item reference type.
//      Call the 3-arg constructor to assign values.
//4.  Call the display method of the object.
//5.  Use instanceof to confirm that the object is, indeed, a Shirt.
//6.  If it is a Shirt, 
//      - cast the object to a Shirt and call the getColor method, assigning 
//        the return value to a String variable.
//      - Print out the color name using a suitable label.
//7.  If it is not a Shirt, print a message to that effect.
//8.  Test your code.  You can test the non-Shirt object condition
//      by instantiating an Item object instead of a Shirt object.
package ex12_3_exercise;

public class ShoppingCart {

    public static void main(String[] args) {
        
//EXAMPLE1 (VALID SHIRT ITEM TEST)
        // declare and instantiate a Shirt object using an Item reference type
        Item item1 = new Shirt(59.99, 'S', 'R'); 
        
        // call the display method on the object, then the getColor method
        item1.display();

        if (item1 instanceof Shirt) {
            String shirtColor = ((Shirt) item1).getColor();
            System.out.println("Shirt color = " + shirtColor);

        } else {
            System.out.println("Sorry, this item is not an object instance of a Shirt class");
        }
        
//============================================
//EXAMPLE2 (INVALID SHIRT ITEM TEST)
 Item item2 = new Trousers(); //invalid item test

        // call the display method on the object, then the getColor method
        System.out.println("");
        item2.display();

        if (item2 instanceof Shirt) {
            String shirtColor = ((Shirt) item2).getColor();
            System.out.println("Shirt color = " + shirtColor);

        } else {
            System.out.println("Cannot retrieve color string. This item is not an object instance of a Shirt class");
        }
  
        
    }//end of main method
    
}//end of ShoppingCart class
