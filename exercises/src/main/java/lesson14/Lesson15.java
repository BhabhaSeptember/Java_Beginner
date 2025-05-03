/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Lesson15 {
    public static void main(String[] args) {
        
//EXAMPLE1 (CODING MISTAKE EXAMPLE)
//1)
//int[] intArray = new int[5];
//below throws the following error: 
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:... 
//...Index 5 out of bounds for length 5
//intArray[5] = 27;
//
//
//2) REFER TO TESTARRAY CLASS BELOW MAIN METHOD
//TestArray myTestArray = new TestArray(5);
//below throws the following error: 
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:... 
//Index 5 out of bounds for length 5
//myTestArray.addElement(5, 23);
//
//
//EXAMPLE2 (OutOfMemoryError)
ArrayList theList = new ArrayList();
while (true) {
    String theString = "A test String";
    theList.add(theString);
    long size = theList.size();
    if (size % 1_000_000 == 0) {
        System.out.println("List has " + size/1_000_000 + "million elements");
    }
}



        
    }//end of main method
    
}//end of Lesson15 class

//========================================== TESTARRAY CLASS ==========================================

class TestArray {
    int[] intArray;
    
    public TestArray (int size) {
        intArray = new int[size];
    }
    
    public void addElement(int index, int value) {
        intArray[index] = value;
    }
    
} 
