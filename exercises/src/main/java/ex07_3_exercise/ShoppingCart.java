
package ex07_3_exercise;

//1. Declare a long, using the L to indicate a long value.  Make it a 
//     very large number (in the billions).
//2. Declare and initialize a float and a char.
//3. Print the long variable with a suitable label.
//4. Assign the long to the int variable.  Correct the syntax error
//     by casting the long as an int.
//5. Print the int variable.  Note the change in value when you run it.

public class ShoppingCart {
    public static void main(String[] args){
        int int1;
        
	//  Declare and initialize variables of type long, float, and char.
        long longNum = 2000000000000000000L;
        float floatNum = 2.2F;
        char charChar = 'B';
        
        // Print the long variable.
        System.out.println("Long number is: " + longNum);
        
	// Assign the long to the int and print the int variable.
        int1 = (int)longNum; //type casted
        System.out.println("After casting to int: " + int1);
        
    }
}
