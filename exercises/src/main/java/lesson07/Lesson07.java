/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson07;

/**
 *
 * @author User
 */
public class Lesson07 {
    public static void main(String[] args) {
        
//        STRING CLASS 
//String class is immutable i.e. value cannot be changed
System.out.println("========== String Class ==========");
//SUMMARY: 
//A string variable hisName is created and initialized directly using a string literal
//This stores "Fred Smith" in the variable hisName
//The program prints the value of hisName with the label "His Name:"
//Output: His Name: Fred Smith

String  hisName = "Fred Smith"; //creates 1 String object in memory
        System.out.println("His Name: " + hisName);

//SUMMARY:
//A second string variable herName is created using the new String(...) constructor
//Although this works, it's not necessary to use new String(...)—just using "Anne Smith\n" would suffice in most cases
//The \n adds a newline at the end
//The program prints the value of herName with the label "Her Name:"
//Output: Her Name: Anne Smith

String herName = new String("Anne Smith\n"); //Creates 2 String objects in memeory
        System.out.println("Her Name: " + herName);

        
        
//         CONCATENATION OF STRINGS
//below we are not changing value of string, we are adding to it and a new object sits in the heap...
//...the original string object also sits until garbage collector removes it 
System.out.println("========== Concatenating Strings ==========");
//SUMMARY
//Declare and initialize a string: myString is initialized with "Hello"
//Output: 1. Hello
//Concatenate " World!" using .concat() method
//The concat() method returns a new string, since String is immutable
//myString is now "Hello World!"
//Output: 2. Hello World!
//Append "!" using + operator. The + operator also creates a new string
//myString becomes "Hello World!!". \n adds a newline after the output
//Output: 3. Hello World!!

String myString = "Hello";
        System.out.println("1. " + myString);
myString = myString.concat(" World!"); //now myString reference points to new object in heap memory
System.out.println("2. " + myString);
myString = myString + "!";
        System.out.println("3. " + myString + "\n");
//        
//               
//          STRING METHODS     
System.out.println("========= String Methods ==========");
//String Method Calls With Primitive Return Values
//A Method call can return a single value of any type
//SUMMARY
//Declare and initialize a string:
//A string variable hello is assigned the value "Hello World"
//Calculate the length of the string:
//The .length() method returns the number of characters in the string, including spaces
//"Hello World" has 11 characters (including the space), so stringLength is 11
//Output: The string 'Hello World' has a length of: 11

String hello = "Hello World";
int stringLength = hello.length();
        System.out.println("The string '" + hello + "' has a length of: " + stringLength);
//
        System.out.println("");

//String Method Calls With Object Return Values
//SUMMARY
//Trim whitespace from a string: 
//The .trim() method removes leading and trailing spaces. " HOW " becomes "HOW"
//Output: 1. HOW
//Concatenate and partially convert to lowercase:
//"DY".toLowerCase() becomes "dy". greet + "dy" becomes "HOWdy"
//Output: 2. HOWdy
//Concatenate first, then convert the whole result to lowercase:
//greet + "DY" gives "HOWDY. .toLowerCase() converts the whole string to "howdy"
//Output: 3. howdy

String greet = " HOW ".trim(); //removes whitespaces, new string reference called greet is created
System.out.println("1. " + greet);
String lc = greet + "DY".toLowerCase();//another object is created
        System.out.println("2. " + lc);
String lc2 = (greet + "DY").toLowerCase();//another object is created
        System.out.println("3. " + lc2);
//        
//
        System.out.println("");
//Using Java API Docs
//Using 1-arg & 2-arg version of String classes, indexOf method.
//SUMMARY
//Initialize a phone number string: The string contains two dashes (-) as separators
//Find the index of the first dash: 
//indexOf('-') returns the position of the first occurrence of -. In "404-543-2345", the first dash is at index 3
//Output: Index of first dash: 3
//Find the index of the second dash:
//.indexOf("-", idx1 + 1) searches from index 4 onward, looking for the next dash
//The second dash is at index 7. 
//Output: Index of second dash: 7

String phoneNum = "404-543-2345";
int idx1 = phoneNum.indexOf('-');
        System.out.println("Index of first dash: " + idx1);
//
int idx2 = phoneNum.indexOf("-", idx1+1);
        System.out.println("Index of second dash: " + idx2);

//
//        STRINGBUILDER CLASS
//String Builders Provide A Mutable Alternative To String Class 
//i.e it can be changed in place
//Instantiate with the New keyword

//String Class VS StringBuilder Class
System.out.println("========= \nString Builder Class ==========");
//SUMMARY
//Part 1: Using String (Immutable)
//"Hello" is stored as a String object. myString2 references this object
//When " World" is concatenated using +, a new String object is created because String is immutable
//So myString now references a new object with value "Hello World"
//Two different objects in memory: "Hello" and "Hello World"
//Part 2: Using StringBuilder (Mutable)
//mySB is initialized with "Hello"
//The .append(" World") modifies the existing object, since StringBuilder is mutable.
//No new object is created; the same object now contains "Hello World"
//Only one object is used and modified directly

String myString2 = "Hello"; //reference to one object
myString = myString2 + " World"; //reference to another object
//
//
StringBuilder mySB = new StringBuilder("Hello"); //reference to one object 
mySB.append(" World"); //reference to same object as above... object changes
//
//
//
//      PRIMITIVE DATA TYPES
// NOTES:
// Integral Types: byte, short, int, long
// Floating Point Types: float, double
// Textual Type: char
// Logical Type: boolean
//
//Variables vs Constants
//Variables can change
//Constants (use final keyword i.e. Cannot change & read-only)-> variable name is declared in all caps
//
//Modulus operator gives remainder (%)


System.out.println("\n ======= Primitive Data Types ========");
// Increment & decrement operators:
//SUMMARY
//Initializes count to 15
//Declares four integer variables: a, b, c, and d
//a gets the current value of count → 15. Then, count is incremented to 16
//b gets 16
//count becomes 17, c gets 17 
//d gets 17

int count = 15;
int a, b, c, d;

a = count++; //1. Post-inrement: increment stored in memory. output=15
b = count; //2. increment is now displayed. output=16
c = ++count; //3. increment displays immediatley. output=17
d = count; //4. incremment from above displays. output17
        System.out.println(a + ", " + b + ", " + c + ", "+ d);
//   
//
//      PROMOTION & CASTING
System.out.println("\n ======= Promotion & Casting ========");
// Caution with Promotion: 
// // EXAMPLE1:
// //equation => 55_555 * 66_666 = 3_703_629_630
//SUMMARY
//Part 1: Multiplication with int operands (incorrect result)
//num1 and num2 are int values
//Their product exceeds the maximum value that an int can hold (2,147,483,647).
//So num1 * num2 causes integer overflow and returns a wrong (negative) result before it's even assigned to num3
//Even though num3 is long, the overflow already happens during the int * int multiplication
//Part 2: Fix using a long operand (correct result)
//One of the operands (num2_1) is a long, so the multiplication is promoted to long * int → long
//No overflow occurs, and the correct result is returned
//Correct Output

int num1 = 55_555;
int num2 = 66_666;
long num3;       
 num3 = num1 * num2; //result is due to int container being too small to hold the resultant value hence incorrect answer
 System.out.println(num3);
 System.out.println(num1 * num2 ); //output = -591_337_666 (incorrect result)

// //Solution to above:
 int num1_1 = 55_555;
 long num2_1 = 66_666;
 long num3_1;
 num3_1 = num1_1 * num2_1;
        System.out.println(num3_1); //output = 3_703_629_630 (correct input)
//
//
// // EXAMPLE2:
//SUMMARY
//Part 1: Incorrect Result (Integer Division)
//num4 / num5 is int / int, which results in integer division → fractional part is discarded
//So 7 / 2 becomes 3, and then it's stored as 3.0 in the double variable num6
//Incorrect result: 3.0 instead of 3.5
//Part 2: Correct Result (Floating-Point Division)
//One operand (num5_1) is a double, so Java promotes the operation to floating-point division
//Now 7 / 2.0 yields 3.5 correctly

// // equation = 7/2 = 3.5
int num4 = 7;
int num5 = 2;
double num6;
num6 = num4 / num5;
        System.out.println(num6); //output = 3.0 (incorrect)

// solution: 
int num4_1 = 7;
double num5_1 = 2;
double num6_1;
num6_1 = num4_1 / num5_1;
        System.out.println(num6_1); //output = 3.5 (correct)
//
//        
//
//
// // TYPE CASTING
// // chops a value down to use a smaller amount of memory 
// // e.g. converting long to int

// // Caution with Type Casting:
// // EXAMPLE1:
//SUMMARY
//Part 1: Incorrect Cast (Data Loss)
//myLong holds a large value (123,987,654,321) that exceeds int's max range (±2,147,483,647).
//Casting this large long to int causes overflow, and the number is chopped (wrapped around), resulting in a negative, incorrect value.
//Part 2: Safe Cast (No Data Loss)
//Here, the long value 99 is within the int range, so casting is safe
//The value is preserved accurately

int myInt;
long myLong = 123_987_654_321L;
myInt = (int) (myLong); //(incorrect) output = -566_397_263 i.e. number is chopped
        System.out.println(myInt);
//        
//// Safer solution:        
int myInt2;
long myLong2 = 99L;
myInt2 = (int) (myLong2);
        System.out.println(myInt2); // (correct) output = 99 (correct)
//
//
//// // EXAMPLE2:
//NOTES: Type casting float/double with fraction part, to an int type, all decimals are lost
//Method is useful only if we want to truncate the value to a whole number
//SUMMARY
//myPercent is a double with the value 51.9
//It is explicitly cast to an int, which removes the decimal part (i.e., truncates).
//The resulting int value is 51, not 52 — no rounding is applied
//The output printed is: 51

int myInt3;
double myPercent = 51.9;
myInt3 = (int) (myPercent);
        System.out.println(myInt3);
//
//
// // Using Promotion & Casting
//  //EXAMPLE1:
//SUMMARY
//Part 1: Compiler Error due to Type Promotion
//Even though the sum is 100, both operands are int, so the result is an int
//Assigning an int result to a byte (a smaller type) without casting causes a compiler error due to potential data loss.
//Java won't implicitly downcast here — you must cast explicitly or use a larger variable type
//Part 2: Corrected Solution Using int
//Here, all variables are int, so no promotion or casting issues occur. 
//Result: 100 is correctly stored and printed.
//Part3: Corrected Solution Using Casting
//numOne1 + numTwo2 results in 100, which is an int by default
//Casting the result to byte using (byte) allows assignment to numThree3
//Since 100 is within the valid byte range (-128 to 127), it works safely
//The output is: 100

//int numOne = 53;
//int numTwo = 47;
//byte numThree; //smaller data type
//numThree = (numOne + numTwo); //compiler error (possible loss of precision)
//        System.out.println(numThree); //output - compiler error
//
//// Solution Using Larger Type For num3
//int numOnee = 53;
//int numTwoo = 47;
//int numThreee;
//numThreee = (numOnee + numTwoo); 
//        System.out.println(numThreee); //correct output = 100
// 
////Solution Using Casting
//int numOne1 = 53;
//int numTwo2 = 47;
//byte numThree3;
//numThree3 = (byte) (numOne1 + numTwo2);
//        System.out.println(numThree3); //correct output = 100

        
//      AUTOMATIC PROMOTION
//Compiler Assumptions for Integegral and Floating Point Data Types
// NOTES:
// Most operations result in int or long
// Byte/char/short values auto promoted to int prior operation
// Operation containing long, promoted to long
// Operation containing float, promoted to floating point
// Literal floating point values promoted to double

// EXAMPLE1;
//SUMMARY
//Part 1: Incorrect:
//Even though a and b are short, the result of a + b is automatically promoted to int
//Java does not allow assigning an int result to a short variable (c) without explicit casting
// This causes a compiler error: “possible loss conversion from int to short”
//Solution 1: Use an int Variable for the Result
//The result is stored in an int variable (cC), which matches the promoted type — no casting needed.
//Solution 2: Use Explicit Casting to short
//The result of a1 + b1 is explicitly cast back to short to match c1's type.
//Works correctly because the sum (3) is within the valid short range (-32,768 to 32,767)

//short a, b, c;
//a = 1; //auto promoted to int type
//b = 2; //auto promoted to int type
//c = a + b; //compiler error ('=' operator attempts to assign int result to short value 'c')

 // Solution1:
//short aA, bB;
//int cC;
//aA = 1;
//bB = 2;
//cC = aA + bB;
//        System.out.println(cC); //correct output

        
// Solution2:
//short a1, b1, c1;
//a1 = 1;
//b1 = 2;
//c1 = (short) (a1 + b1);
//        System.out.println(c1); //correct output
//        
       

// // USING A LONG (please refer to Person class declaration below main method)
//SUMMARY
//This code defines a Person class that calculates a person's age in days and seconds, based on their age in years. 
//It also demonstrates how to correctly use a long literal in calculations to prevent overflow
//A Person object is created.
//The person's age (ageYears) is set to 29
//The calculateAge() method is called to compute and print the age in days and seconds
//Inside Person class: ageDays uses int since the result is small
//ageSeconds uses long with 24L to ensure the multiplication doesn't overflow (because int * int * int * int might exceed int range).

//Person person01 = new Person();
//person01.ageYears = 29;
//person01.calculateAge();


// // USING A FLOATING POINT
// // Example1:
//SUMMARY
//This code demonstrates how type incompatibility between integers and floating-point numbers can cause compiler errors, 
//and how to resolve them using explicit casting or by using appropriate data types (double)
//Part 1 - Results in Compiler Error
//Both lines cause compiler errors because you are trying to assign a double result to an int variable without casting
//Solution 1: Use double
//The expressions result in a double, and the variables are also double — so this works correctly.
//Solution 2: Use type casting to assign to int
//Here, the result is explicitly cast to int, which resolves the type mismatch
//Note: The decimal portion (if any) is truncated, not rounded

//int n1 = 1 + 2 + 3 + 4.0; //compiler error. Expression is automatically promoted to floating points
//int n2 = (1 + 2 + 3 + 4) * 1.0; //compiler error. Expression is automatically promoted to floating points


// // Solution1:
//double n3 = 1 + 2 + 3 + 4.0; //correct output = 10.0
//double n4 = (1 + 2 + 3 + 4) * 1.0; //correct output = 10.0


// // Solution2:
//int n5 = (int) (1 + 2 + 3 + 4.0); //correct output = 10.0
//int n6 = (int) ((1 + 2 + 3 + 4) * 1.0); //correct output = 10.0


// // FLOATING POINT DATA TYPES & ASSIGNMENT
// // EXAMPLE1:
//SUMMARY
//This code illustrates how to correctly assign decimal (floating-point) values to a variable of type float in Java, addressing common compiler errors
//Part 2: Incorrect - Results in Compiler Error
//Java treats decimal literals like 27.9 as double by default
//Assigning a double literal directly to a float variable causes a type mismatch compiler error
//Solution 1: Use the suffix F for float literals
//Adding F or f explicitly tells Java this is a float literal
//This resolves the type mismatch
//Solution 2: Use explicit type casting
//Cast the double literal to float using (float)
//This also resolves the type mismatch

//float float1 = 27.9; //compiler error (decimal numbers are auto promoted to double type unless otherwise specified)

// // Solution1:
//float float2 = 27.9F; //correct - specify float number with letter 'F'


// // Solution2:
//float float3 = (float) 27.9; //correct - type cast number to float type
    }  
}


// USING A LONG EXAMPLE

class Person {

    public int ageYears = 32;
    
    public void calculateAge() {
        int ageDays = ageYears * 365;
        long ageSeconds = ageYears * 365 * 24L * 60 * 60;
        
        System.out.println("At " + ageYears + " years old, you are " + ageDays + " days old.");
        System.out.println("At " + ageYears + " years old, you are " + ageSeconds + " seconds old.");
    }//end of calculateAge method
    
}//end of Person class