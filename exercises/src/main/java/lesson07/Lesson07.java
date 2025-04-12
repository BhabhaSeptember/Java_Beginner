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
//System.out.println("========== String Class ==========");
//String  hisName = "Fred Smith";
//        System.out.println("His Name: " + hisName);
//
//String herName = new String("Anne Smith\n");
//        System.out.println("Her Name: " + herName);

        
        
//         CONCATENATION OF STRINGS
//below we are not changing value of string, we are adding to it and a new object sits in the heap...
//...the original string object also sits until garbage collector removes it
//System.out.println("========== Concatenating Strings ==========");
//String myString = "Hello";
//        System.out.println("1. " + myString);
//myString = myString.concat(" World!"); //now myString reference points to new object in heap memory
//System.out.println("2. " + myString);
//myString = myString + "!";
//        System.out.println("3. " + myString + "\n");
//        
//        
        
//          STRING METHODS     
//System.out.println("========= String Methods ==========");
//String hello = "Hello World";
//int stringLength = hello.length();
//        System.out.println("The string '" + hello + "' has length of: " + stringLength);
//
//        System.out.println("");
//String greet = " HOW ".trim(); //removes whitespaces
//System.out.println("1. " + greet);
//String lc = greet + "DY".toLowerCase();
//        System.out.println("2. " + lc);
//String lc2 = (greet + "DY").toLowerCase();
//        System.out.println("3. " + lc2);
//        
//
//        System.out.println("");        
//String phoneNum = "404-543-2345";
//int idx1 = phoneNum.indexOf('-');
//        System.out.println("Index of first dash: " + idx1);
//
//int idx2 = phoneNum.indexOf("-", idx1+1);
//        System.out.println("Index of second dash: " + idx2);


//        STRINGBUILDER CLASS
//string builders are mutable

////String class vs StringBuilder class
//System.out.println("========= \nString Builder Class ==========");
//String myString = "Hello"; //reference to one object
//myString = myString + " World"; //reference to another object
//
//
//StringBuilder mySB = new StringBuilder("Hello"); //reference to one object 
//mySB.append(" World"); //reference to same object as above... object changes



//      PRIMITIVE DATA TYPES
// NOTES:
// Integral Types: byte, short, int, long
// Floating Point Types: float, double
// Textual Type: char
// Constants: (use 'final' keyword)
// Modulus Operator (%)


//System.out.println("\n ======= Primitive Data Types ========");

// Increment & decrement operators:
//int count = 15;
//int a, b, c, d;
//
//a = count++; //1. increment stored in memory i.e. 15
//b = count; //2. increment is now displayed i.e. 16
//c = ++count; //3. increment displays immediatley i.e. 17
//d = count; //4. incremment from above displays i.e. 17
//        System.out.println(a + ", " + b + ", " + c + ", "+ d);
//   

//      PROMOTION & CASTING

 // Caution with Promotion: 
// // EXAMPLE1:
// //equation => 55_555 * 66_666 = 3_703_629_630
// int num1 = 55_555;
// int num2 = 66_666;
// long num3;       
// num3 = num1 * num2; //result is due to int container being too small to hold the resultant value hence incorrect answer
// System.out.println(num1 * num2 ); //output = -591_337_666 (incorrect result)

// //Solution to above:
// int num1 = 55_555;
// long num2 = 66_666;
// long num3;
// num3 = num1 * num2;
//        System.out.println(num3); //output = 3_703_629_630 (correct input)


// // EXAMPLE2:
// // equation = 7/2 = 3.5
//int num1 = 7;
//int num2 = 2;
//double num3;
//num3 = num1 / num2;
//        System.out.println(num3); //output = 3.0 (incorrect)

// solution: 
//int num1 = 7;
//double num2 = 2;
//double num3;
//num3 = num1 / num2;
//        System.out.println(num3); //output = 3.5 (correct)
//
//        


// // TYPE CASTING
// // chops a value down to use a smaller amount of memory 
// // e.g. converting long to int

// // Caution with Type Casting:
// // EXAMPLE1:
//int myInt;
//long myLong = 123_987_654_321L;
//myInt = (int) (myLong); //(incorrect) output = -566_397_263 i.e. number is chopped
//        System.out.println(myInt);
        

//// Safer solution:        
//int myInt;
//long myLong = 99L;
//myInt = (int) (myLong);
//        System.out.println(myInt); // (correct) output = 99 (correct)



//// // EXAMPLE2:
//int myInt;
//double myPercent = 51.9;
//myInt = (int) (myPercent);
//        System.out.println(myInt);

// // Using Promotion & Casting
//  //EXAMPLE1:
//int num1 = 53;
//int num2 = 47;
//byte num3; //smaller data type
//num3 = (num1 + num2); //compiler error (possible loss of precision)
//        System.out.println(num3); //output - compiler error
//
//// Solution Using Larger Type For num3
//int num1 = 53;
//int num2 = 47;
//int num3;
//num3 = (num1 + num2); 
//        System.out.println(num3); //correct output = 100
// 

////Solution Using Casting
//int num1 = 53;
//int num2 = 47;
//byte num3;
//num3 = (byte) (num1 + num2);
//        System.out.println(num3); //correct output = 100

        
//      AUTOMATIC PROMOTION
// NOTES:
// most operations result in int or ling
// byte/char/short values auto promoted to int prior operation
// operation containing long, promoted to long
// operation containing float, promoted to floating point
// literal floating point values promoted to double

// EXAMPLE1;
//short a, b, c;
//a = 1; //auto promoted to int type
//b = 2; //auto promoted to int type
//c = a + b; //compiler error ('=' operator attempts to assign int result to short value 'c')

// // Solution1:
//short a, b;
//int c;
//a = 1;
//b = 2;
//c = a + b;
//        System.out.println(c); //correct output

        
// Solution2:
//short a, b, c;
//a = 1;
//b = 2;
//c = (short) (a + b);
//        System.out.println(c); //correct output
//        
//        

// // USING A LONG (please refer to class declaration below main method)
//Person person01 = new Person();
//person01.ageYears = 29;
//person01.calculateAge();


// // USING A FLOATING POINT
// // Example1:
//int num1 = 1 + 2 + 3 + 4.0; //compiler error
//int num2 = (1 + 2 + 3 + 4) * 1.0; //compiler error


// // Solution1:
//double num1 = 1 + 2 + 3 + 4.0; //correct output = 10.0
//double num2 = (1 + 2 + 3 + 4) * 1.0; //correct output = 10.0


// // Solution2:
//int num1 = (int) (1 + 2 + 3 + 4.0); //correct output = 10.0
//int num2 = (int) ((1 + 2 + 3 + 4) * 1.0); //correct output = 10.0


// // FLOATING POINT DATA TYPES & ASSIGNMENT
// // EXAMPLE1:
//float float1 = 27.9; //compiler error (decimal numbers are auto promoted to double type unless otherwise specified)

// // Solution1:
//float float1 = 27.9F; //correct - specify float number with letter 'F'


// // Solution2:
//float float1 = (float) 27.9; //correct - type cast number to float type
    }  
}


// USING A LONG

class Person {

    public int ageYears = 32;
    
    public void calculateAge() {
        int ageDays = ageYears * 365;
        long ageSeconds = ageYears * 365 * 24L * 60 * 60;
        
        System.out.println("At " + ageYears + " years old, you are " + ageDays + " days old.");
        System.out.println("At " + ageYears + " years old, you are " + ageSeconds + " seconds old.");
    }
}