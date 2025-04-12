package ex08_1_exercise;

//In the ShoppingCart class:
//2. Call the setColor method on item1.  If it returns true,
//     print out item1.color.  If it returns false, print an
//     invalid color message.
//3. Test the method with both a valid color and an invalid one.
public class ShoppingCart {

    public static void main(String[] args) {
        Item item1 = new Item();

        // Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
        //   message.
        if (item1.setColor(' ')) {
            System.out.println("Item1 color: " + item1.color);
        } else {
            System.out.println("Oops, invalid color!");
        }

        // Test the class, using both valid and invalid colors.
        if (item1.setColor('G')) {
            System.out.println("Item1 color: " + item1.color);
        } else {
            System.out.println("Oops, invalid color!");
        }
    }
}
