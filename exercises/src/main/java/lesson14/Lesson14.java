/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson14;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Lesson14 {

    public static void main(String[] args) throws Exception {

//EXAMPLE1 (CODING MISTAKE EXAMPLE)
//1)
//int[] intArray = new int[5];
////below throws the following error: 
////Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:... 
////...Index 5 out of bounds for length 5
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
//This code continuously adds the same string ("A test String") to an ArrayList, 
//indefinitely, and prints a message every time the list reaches another million elements.
//ArrayList theList = new ArrayList();
//while (true) {
//    String theString = "A test String";
//    theList.add(theString);
//    long size = theList.size();
//    if (size % 1_000_000 == 0) {
//        System.out.println("List has " + size/1_000_000 + "million elements");
//    }
//}
//
//
//
//EXAMPLE3 (WORKING WITH EXCEPTIONS)
//1) NO EXPLICIT EXCEPTIONS THROWN
//        Utils utilsOne = new Utils();
//        utilsOne.doThis();
////
//
//2) EXPLICITLY THROWING EXCEPTIONS
//Utils utilsTwo = new Utils();
//utilsTwo.doThis();
//        System.out.println("Back to main method");
//
//
//
//3)UNCAUGHT EXCEPTIONS
//Utils utilsThree = new Utils();
//utilsThree.doThis();
//System.out.println("Back to main method");
//
//
//
//4)REFER TO TESTCLASS BELOW
//1)
//        TestClass testClass = new TestClass();
//        testClass.testCheckedExceptionOne();
// 
// 
//
//2) 
//TestClass testClass2 = new TestClass();
// testClass2.testCheckedExceptionTwo();
//
//
//3)
//TestClass testClass3 = new TestClass();
//try {
//    testClass3.testCheckedExceptionThree();
//} catch (IOException e) {
//    System.out.println(e);
//}
//
//
//
//4)
//NOTE: we know createFile can throw an IOException so it would be better to name the actual expected exception
//Otherwise in this case we have printlns in the method to show where an error has occurred which is with the array index being out of bounds 
//TestClass testClass4 = new TestClass();
//try {
//    
//    testClass4.createFile("c:/testFile2.txt");
//} catch(Exception e) { 
//    System.out.println(e);
//}
//
//
//
//5.1)
        TestClass testClass5 = new TestClass();
//try {   
//    testClass5.createFileTwo("c:/notWritableDir"); //should get Access is Denied
//} catch(Exception e) { 
//    System.out.println(e);
//}
//
//
//5.2) Catching IOException
//try {   
////1)notWritableDir causes IOException: Access is denied
////    testClass5.createFileTwo("c:/notWritableDir"); 
////2)writableDir causes second exception to be thrown relating to first arg of createTempFile method being too short
//    testClass5.createFileTwo("C:/Users/User/Documents/Bootcamp - 2024/9. Java Beginner/classwork/exercises/src/main/java/lesson14/writableDir.txt");
//} catch(IOException ioe) { 
//    System.out.println(ioe);
//}
//
//
//}
//
//
//5.3) Catching IllegalArgumentException
//        try {
////1)    
////            testClass5.createFileTwo("C:/Users/User/Documents/Bootcamp - 2024/9. Java Beginner/classwork/exercises/src/main/java/lesson14/writableDir.txt");
////2)
//testClass5.createFileThree("C:/Users/User/Documents/Bootcamp - 2024/9. Java Beginner/classwork/exercises/src/main/java/lesson14/writableDir2.txt"); 
//        } catch (IOException ioe) {
//            System.out.println(ioe);
//        } catch (IllegalArgumentException iae) {
//            System.out.println(iae);
//        }
//
//
//5.4) Catching Remaining Exceptions
try {
testClass5.createFileThree("C:/Users/User/Documents/Bootcamp - 2024/9. Java Beginner/classwork/exercises/src/main/java/lesson14/writableDir2.txt"); 
        } catch (IOException ioe) {
            System.out.println(ioe);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae);
        } catch (Exception e) {
            System.out.println(e);    
        }

    }//end of main method

}//end of Lesson14 class

//========================================== TESTARRAY CLASS ==========================================
class TestArray {

    int[] intArray;

    public TestArray(int size) {
        intArray = new int[size];
    }

    public void addElement(int index, int value) {
        intArray[index] = value;
    }

}

//========================================== UTILS CLASS ==========================================
//WORKING WITH EXCEPTIONS
class Utils {
//1) NO EXPLICIT EXCEPTIONS THROWN 
//    public void doThis() {
//        System.out.println("Arrived in doThis()");
//        doThat();
//        System.out.println("Back in doThis()");
//    }
//    
//    public void doThat() {
//        System.out.println("In doThat()");
//    }
//    
//    
//2) EXPLICITLY THROWING AN EXCEPTION
//Can either use a try/catch block to catch the exception or throw the exception object
//If exception is thrown, execution of program goes back to calling method...
//...then into the catch block associated with try block containing the...
//...method call that resulted in an exception object being thrown    
//    public void doThis() {
//        System.out.println("Arrived in doThis()");
//        try {
//            doThat();
//        } catch (Exception e) {
//            System.out.println("doThis - Exception caught: " + e.getMessage());
//        }
//        System.out.println("Back in doThis()");
//    }
//
//    public void doThat() throws Exception {
//        System.out.println("doThat: Throwing an exception");
//        throw new Exception("Ouch!");
//    }
//
//    
//    
//3)UNCAUGHT EXCEPTIONS  

//    public void doThis() throws Exception {
//        System.out.println("Arrived in doThis()");
//        doThat();
//        System.out.println("Back in doThis()");
//    }
//
//    public void doThat() throws Exception {
//        System.out.println("doThat: Throwing an exception");
//        throw new Exception("Ouch!");
//    }
}//end of Utils class

//========================================== TESTCLASS CLASS ==========================================
class TestClass {
//1) Below we create a file using the constructor
//Constructor can throw a NullPointerException if File class argument is null...
//...but we are not forced to catch this exception

//    public void testCheckedExceptionOne() {       
//    
//        File testFile = new File("C:\\Users\\User\\Documents\\Bootcamp - 2024\\9. Java Beginner\\classwork\\exercises\\src\\main\\java\\lesson14\\testFile.txt");
//
//        System.out.println("testFile exists: " + testFile.exists());
//        testFile.delete();
//        System.out.println("testFile exists: " + testFile.exists());
//    }
//
//
//2) Below we use createNewFile method which can throw an IOException
//        public void testCheckedExceptionTwo() throws IOException {
//        File testFile = new File("C:\\Users\\User\\Documents\\Bootcamp - 2024\\9. Java Beginner\\classwork\\exercises\\src\\main\\java\\lesson14\\testFile.txt");
//        testFile.createNewFile(); //must throw an IOException in method signature
//        
//        System.out.println("testFile exists: " + testFile.exists());
//        testFile.delete();
//        System.out.println("testFile exists: " + testFile.exists());       
//    }
//        
//        
//        
//3) Working with a Checked Exception (See Try-Catch block in main method above
//         public void testCheckedExceptionThree() throws IOException {
//        File testFile = new File("C://Users\\User\\Documents\\Bootcamp - 2024\\9. Java Beginner\\classwork\\exercises\\src\\main\\java\\lesson14\\testFile.txt");
//        testFile.createNewFile(); //must throw an IOException in method signature
//        
//        System.out.println("testFile exists: " + testFile.exists());
//    }
//    
//    
//    
//4)Better Coding Practice
//public void createFile(String name) throws IOException {
//File f = new File(name);
//    System.out.println(name + " exists? " + f.exists());
//    
//    f.createNewFile();
//    System.out.println(name  + " exists? " + f.exists());
//    
//    int[] intArray = new int[5];
//    intArray[5] = 27;
//    
//}  
//    
//    
//    
//5)MULTIPLE EXCEPTIONS
    public void createFileTwo(String name) throws IOException {
        File testF = new File(name);
        testF.createNewFile();

        File tempF = testF.createTempFile("te", null, testF);

        System.out.println("Temp filename: " + tempF.getPath());

        int myInt[] = new int[5];
        myInt[5] = 25;
    }

    public void createFileThree(String name) throws IOException {
        File testF = new File(name);
        testF.createNewFile();

        File tempF = testF.createTempFile("temp", null, testF.getParentFile());

        System.out.println("Temp filename: " + tempF.getPath());

        int myInt[] = new int[5];
        myInt[5] = 25;
    }
    
    

}//end of TestClass
