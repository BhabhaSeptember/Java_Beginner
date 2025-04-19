/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author User
 */
public class Lesson10 {
    public static void main(String[] args) {
        
//EXAMPLE1 (REFER TO EMPLOYEES CLASS BELOW)
//1)
//Employees employeesTest = new Employees();
//employeesTest.areNamesEqual();
//
//2)
//Employees employeesTest = new Employees();
//employeesTest.areNamesEqual();
//
//
//EXAMPLE2 (REFER TO EMPLOYEES CLASS BELOW)
//because only one object will be created to contain "Fred Smith", both references (name1 & name2) point to it...
//...therefore result will be the same because object being referenced is the same
//Employees employeesTest = new Employees();
//employeesTest.areNamesEqual(); //output = same names... 
//
//employeesTest.name1 = "Jane Doe"; //changing the object that name1 is referencing
//employeesTest.areNamesEqual();//now output = different names...
//
//
//EXAMPLE3 (REFER TO EMPLOYEES CLASS BELOW)
//Employees employeesTest = new Employees();
//employeesTest.areNamesEqual(); //output = different names...
//
//
//EXAMPLE4 (CONDITIONAL OPERATORS)
//int i = 2;
//int j = 8;
//        System.out.println("1) ((i < 1) && (j > 6)): " + ((i < 1) && (j > 6)));
//        System.out.println("2) ((i < 1) || (j > 10)): " + ((i < 1) || (j > 10)));
//        System.out.println("3) (!(i < 3)): " + (!(i < 3)));
//
//
//EXAMPLE5 (TERNARY CONDITIONAL OPERATOR)
//1)
//int x = 2, y = 5, z = 0;
//
//z = (y < x) ? x : y;
//        System.out.println("1) z = (y < x) ? x : y \nAns = " + z);
//
//2)
//int numberOfGoals = 3;
//String s = (numberOfGoals == 1 ? "goal" : "goals");
//        System.out.println("I scored " + numberOfGoals + " " + s);
//
//3)
//int numberOfGoals = 0;
//        System.out.println("I scored " + numberOfGoals + " " + 
//                (numberOfGoals == 1 ? "goal" : "goals"));
//
//
//
//EXAMPLE6 (CHAINING & NESTED IF STATEMENTS)
//int month = 14;
//boolean isLeapYear = false;
//
//if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || 
//        month == 10 || month == 12) {
//    System.out.println("There are 31 days in this month");
//}
//else if (month == 2) {
//    if(!isLeapYear) {
//        System.out.println("There are 28 days in this month");
//    } else System.out.println("There are 29 days in this month");
//}
//else if (month == 4 || month == 6 || month == 9 || month == 11) {
//    System.out.println("There are 30 days in this month");
//}
//else System.out.println("Invalid month. Choose between 1 - 12");
//
//
//EXAMPLE7 (SWITCH STATEMENT)
int month = 2;
boolean isLeapYear = true;

switch (month) {
    case 1: case 3: case 5: case 7:
    case 8: case 20: case 12:
        System.out.println("There are 31 days in this month");
        break; //causes switch statement to exit without evaluating remaining cases
    case 2: //case keyword + literal value = case label
        if (!isLeapYear) {
            System.out.println("There are 28 days in this month");
        } else
            System.out.println("There are 29 days in this month");
        break;
    case 4: case 6: case 9: case 11:
        System.out.println("There are 30 days in this month");
        break;
    default:
        System.out.println("Invalid month. Choose between 1 - 12");
}

    }//end of main method
    
}//end of lesson10 package


// ==================================== EMPLOYEES CLASS ====================================
class Employees {
//EXAMPLE1
//    public String name1 = "Fred Smith";
//    public String name2 = "Sam Smith";
    
//    1)
//    public void areNamesEqual() {
//        if (name1.equals(name2)) { //'equals' is case sensitive
//            System.out.println("Same names...");
//        }
//        else {
//            System.out.println("Different names...");
//        }
//    }//end of first areNamesEqual 
//    
//    2)
//     public void areNamesEqual() {
//        if (name1.equalsIgnoreCase(name2)) { //case insensitive
//            System.out.println("Same names...");
//        }
//        else {
//            System.out.println("Different names...");
//        }
//    }//end of second areNamesEqual 
//    
//    
//    EXAMPLE2
//    below, only one "Fred Smith" object will be instantiated but it has two different references
//    public String name1 = "Fred Smith";
//    public String name2 = "Fred Smith";
//    
//    public void areNamesEqual() {
//        if (name1 == name2) {
//            System.out.println("Same names...");
//        }
//        else {
//            System.out.println("Different names...");
//        }
//    }//end of areNamesEqual method
//    
//    
//    EXAMPLE3
//'new' keyword here creates new object....
//...so even if strings have same value, there are two separate string objects that have been created
//    public String name1 = new String("Fred Smith");
//    public String name2 = new String("Fred Smith");
//    
//    public void areNamesEqual() {
//        if (name1 == name2) {
//            System.out.println("Same names...");
//        }
//        else {
//            System.out.println("Different names...");
//        }
//    }//end of areNamesEqual method
//    
    
    
    
}//end of employees class
