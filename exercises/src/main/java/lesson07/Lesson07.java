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
//System.out.println("\n ======= Primitive Data Types ========");
//int count = 15;
//int a, b, c, d;
//
//a = count++; //increment stored in memory
//b = count; // increment displays
//c = ++count; //increment displays immediatley
//d = count; //incremment from above displays
//        System.out.println(a + ", " + b + ", " + c + ", "+ d);
//   


//===========================================================================
//===========================================================================
//===========================================================================
//===========================================================================


//      PROMOTION & CASTING
// EXAMPLE 1:
//int num1 = 53;
//int num2 = 47;
//byte num3;
//
//num3 = (num1 + num2); //compiler error
        System.out.println(num3); //compiler error

//EXAMPLE 2:
// Solution Using Larger Type For num3
//int num1 = 53;
//int num2 = 47;
//int num3;
//num3 = (num1 + num2);
//        System.out.println(num3);


//EXAMPLE 3:
//Solution Using Casting
int num1 = 53;
int num2 = 47;
byte num3;
num3 = (byte) (num1 + num2);
        System.out.println(num3);
        







    }
    
}
