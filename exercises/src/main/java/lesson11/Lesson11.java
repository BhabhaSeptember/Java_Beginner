/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

import java.time.LocalDate;//imports LocalDate class from java.time package
import java.time.*; //imports all classes in the java.time package
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Lesson11 {

    public static void main(String[] args) {

//EXAMPLE1 (WORKING WITH DATES)
//LocalDate myDate = LocalDate.now();
//        System.out.println("Today's date: " + myDate);
//
//myDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
//
////WORKING WITH DIFFERENT CALENDARS
////JapaneseDate is a class in the java.time.chrono package
//JapaneseDate jDate = JapaneseDate.from(myDate); //using static from() method
//        System.out.println("Japanese date: " + jDate);
//
//
//
//EXAMPLE2 (FORMATTING DATES)
//LocalDateTime today = LocalDateTime.now();
//        System.out.println("Today's date time (no formatting)       : " + today);
//        
//String sDate = today.format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println("Date in ISO_DATE_TIME format            : " + sDate);
//
//String fDate = today.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
//        System.out.println("Date formatted with MEDIUM FormatStyle  : " + fDate);
//    
//
//==================================================================================================
//
//******************************** TODO ********************************
//
//EXAMPLE3 (PARSING THE ARGS ARRAY)
//System.out.println("args[0] is: " + args[0]);
//System.out.println("args[1] is: " + args[1]);
//
//
// 
//==================================================================================================
//
//
//EXAMPLE4 (2-D ARRAYS)
//syntax examples
//int [] [] yearlySales; //declaring a 2-d array of type int called 'yearlySales'
//NOTES: 
//below has 5 arrays inside an array i.e. array has 5 elements which are arrays
//each of the 5 arrays has 4 elements in it
//yearlySales = new int[5][4]; //instantiating 2-d array with 5 arrays of 4 elements each
// 
//
//INITIALIZING A 2-D ARRAY
//int [] [] yearlySales = new int[5][4];
////Array 1
//yearlySales[0][0] = 1000;
//yearlySales[0][1] = 1500;
//yearlySales[0][2] = 1800;
//yearlySales[0][3] = 1200;
////Array 2
//yearlySales[1][0] = 2100;
//yearlySales[1][1] = 2700;
//yearlySales[1][2] = 2500;
//yearlySales[1][3] = 2300;
////Array 3
//yearlySales[2][0] = 3000;
//yearlySales[2][1] = 3100;
//yearlySales[2][2] = 3300;
//yearlySales[2][3] = 3900;
////Array 4
//yearlySales[3][0] = 4000;
//yearlySales[3][1] = 4500;
//yearlySales[3][2] = 4600;
//yearlySales[3][3] = 4800;
////Array 5
//yearlySales[4][0] = 5000;
//yearlySales[4][1] = 5100;
//yearlySales[4][2] = 5300;
//yearlySales[4][3] = 5500;
//
//System.out.println(yearlySales[0][0]);
//
//
//
//EXAMPLE5 (ALTERNATING LOOPING CONSTRUCTS)
//1) WHILE LOOP (REFER TO ELEVATOR CLASS BELOW MAIN METHOD)
//Elevator elevatorTest = new Elevator();
//elevatorTest.changeFloor(1);
//
//
//2) WHILE LOOP WITH COUNTER
//System.out.println("/*");
//int counter = 0;
//while (counter < 3) {
//    System.out.println(" *");
//    counter++;
//}
//        System.out.println("*/");
//
//
//3) STANDARD FOR LOOP
//for (int i = 1; i < 5; i++) { //counter; boolean expression; increment
//        System.out.println("i = " + i + "; ");
//    }
//
//
//4) STANDARD FOR LOOP VS WHILE LOOP
//a)while loop
//System.out.println("===== WHILE LOOP =====");
//int i = 0;
//while (i < 3) {
//    System.out.println(" *");
//    i++;
//}
//
//b)for loop
//System.out.println("\n===== FOR LOOP =====");
//for (int num = 0; num < 3; num++) {
//    System.out.println(" *");
//}
//
//
//5) STANDARD FOR LOOP VS ENHANCED FOR LOOP
//a)enhanced for loop (used only to process arrays)
//System.out.println("\n===== ENHANCED FOR LOOP =====");
//String[] names = {"Jack", "Jill", "Jonas", "Jane"};
//for(String name: names) {
//    System.out.println("- " + name);
//}
//
//b)standard for loop
//System.out.println("\n===== STANDARD FOR LOOP =====");
//for (int idx = 0; idx < names.length; idx++) {
//    System.out.println("- " + names[idx]);
//}
//
//
//6) DO/WHILE LOOP (REFER TO FACTORIAL METHOD IN ELEVATOR CLASS BELOW)
//Elevator factorialTest = new Elevator();
//factorialTest.factorial(5);  
//  
//
//7) THE CONTINUE KEYWORD
//        String[] names = {"Jack", "Unavailable", "Jill", "Jonas", "Jane"};
//        for (int idx = 0; idx < names.length; idx++) {
//            if (names[idx].equalsIgnoreCase("Unavailable")) {
//                continue;
//            }
//            System.out.println(names[idx]);
//        }
//
//
//
//EXAMPLE6 (NESTING LOOPS)
//1) NESTED FOR LOOP
//int height = 4, width = 10;
//
//for (int row = 0; row < height; row++) {
//    for (int col = 0; col < width; col++) {
//        System.out.print("@");
//    }
//    System.out.println();
//}//end of outer for loop
//
//
//2) NESTED WHILE LOOP
//String name = "Bhabha";
//String guess = "";
//int attempts = 0;
//while (!guess.equalsIgnoreCase(name)) {
//    guess = "";
//    while (guess.length() < name.length()) {
////        note "97" is ASCII code for lowercase letter 'a' and 122 is code for 'z'
//        char asciiChar = (char) (Math.random() * 26 + 97); //casting the random number between ASCII codes 97-122 to its character between a-z
//        guess += asciiChar; //add these letters to guess until guess string is same length as name
//    }
//    attempts++;
//}
//        System.out.println(name + " found after " + attempts + " tries!");
//
//
//
//EXAMPLE7 (PROCESSING A 2-D ARRAY - REFER TO INITARRAY METHOD JUST BELOW MAIN METHOD - ABOVE ELEVATOR CLASS)
//        int sales[][] = new int[3][4]; //array has 3 rows of 4 columns each
//        initArray(sales);
//        System.out.println("Yearly sales by quater beginning 2010: ");
//        for (int i = 0; i < sales.length; i++) { //iterates through each year (rows)
//            for (int j = 0; j < sales[i].length; j++) { //iterates through each quarter of the year(columns)
//                System.out.println("\tQ" + (j + 1) + " R" + sales[i][j]);
//            }
//            System.out.println();
//        }//end of outer for loop
//
//
//
//EXAMPLE8 (ARRAYLIST)
        ArrayList<String> names; //arraylist of String object type note: arraylists can only consist of object types, not primitive data types
        names = new ArrayList(); //dont have to specify size of arraylist when instantiating it, but if you do and you add more elements, the list will grow

        names.add("Jamie"); //adding will increase the size of arraylist dynamically
        names.add("Gustav");
        names.add("Alisa");
        names.add("Bhabha");
        names.add("John");
        names.add(2, "Prashant");//overloaded add method to insert into specified index
//
////removing an element reduces the size of araylis
        names.remove(0); //removes element at index 0 i.e. first element
        names.remove(names.size() - 1); //removes last element in list
        names.remove("Gustav");

        System.out.println(names);

    }//end of main method

    public static void initArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // for each year
            for (int j = 0; j < arr[i].length; j++) { // for each quarter
                arr[i][j] = (int) (Math.random() * 50_000); // random sales between 0–999
            }
        }
    }//end of initArray method

//================================== ELEVATOR CLASS ==================================
    static class Elevator {

        public int currentFloor = 10;

        public void changeFloor(int targetFloor) {
            while (currentFloor != targetFloor) { //while boolean expression is true, body of while loop is executed
                if (currentFloor < targetFloor) {
                    goUp();
                } else {
                    goDown();
                }
            }//end of while loop
            System.out.println("You have reached your destination..." + currentFloor);
        }//end of changeFloor method

        public void goUp() {
            currentFloor++;
            System.out.println("\nFloor: " + currentFloor + "   --->   Going Up...");
        }//end of goUp method

        public void goDown() {
            currentFloor--;
            System.out.println("\nFloor: " + currentFloor + "   --->  Going Down...");
        }//end of goDown method

        static void factorial(int target) {
            int save = target;
            int fact = 1;
            do {
                fact *= target--; //executed atleast once before evaluating condition
            } while (target > 0);
            System.out.println("Factorial for " + save + " = " + fact);
        }//end of factorial method

    }//end of Elevator class   

//================================== ARRAYLIST EXAMPLE CLASS ==================================
}//end of Lesson11 class
