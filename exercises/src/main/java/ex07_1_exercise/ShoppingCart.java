
package ex07_1_exercise;

//1. Instantiate the StringBuilder object (sb), initializing it
//     to firstName, using the StringBuilder constructor.
//2. Use the append method of the StringBuilder object to append the 
//     last name back onto the first name.  You can just use a String 
//     literal for the last name.  
//     Print the StringBuilder object and test your code.  
//     It should show the full name.
//
//Challenge:  Can you append the last name without using a String literal?

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;

        // Get the index of the space character (" ") in custName. 
        spaceIdx = custName.indexOf(" ");
        System.out.println("Index of space = " + spaceIdx);

        // Use the substring method parse out the first name and print it.
        //NOTE: substring(int beginIndex, int endIndex)
        firstName = custName.substring(0, spaceIdx);
        System.out.println("First Name = " + firstName);
        
    }
}
