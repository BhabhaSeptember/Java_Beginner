//In the ShoppingCart class, 
//6.  Declare and instantiate a Shirt object, using the 3 arg constructor.
//7.  Call the display() method on the object reference. 
//      Where is the display method coded?

package ex12_1_exercise;

public class ShoppingCart {
    public static void main(String[] args){

	// instantiate a Shirt object and call display() on the object reference
 Shirt myShirt = new Shirt(79.99, 'S', 'G');
 myShirt.display(); //display method is coded in the Item superclass
        System.out.println("\tSize: " + myShirt.getSize());
 
        
//        Shirt yourShirt = new Shirt(89.99, 'M', 'B');
//        yourShirt.display();
//        System.out.println("\tSize: " + yourShirt.getSize());
    }
}
