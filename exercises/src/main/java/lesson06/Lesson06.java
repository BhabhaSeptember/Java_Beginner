/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson06;

/**
 *
 * @author User
 */
public class Lesson06 {
    public static void main(String[] args) {
//        EXAMPLE1: REFER TO CUSTOMER CLASS DECLARATION BELOW MAIN METHOD
//        Customer customer01 = new Customer();
//        Customer customer02 = new Customer();
//        
//        customer01.age = 40;
//        customer02.name = "Duke";
//        
//        customer01.displayCustomer();
//        customer02.displayCustomer();

//        EXAMPLE2: REFER TO CAMERA CLASS DECLARATION BELOW MAIN METHOD
//        Working with object references
//          Camera remote1 = new Camera(); //remote1 is a reference for one camera object
//          Camera remote2 = new Camera(); //remote2 is references for another camera object
//          remote1.name = "Remote1";
//          remote2.name = "Remote2";
//          
//          remote1.play(); //remote1 calls a method for its own camera object that it is a reference for
//          remote2.play(); //remote2 calls a method for its own camera object 
// 
//          System.out.println("");
//          remote2 = remote1; //now remote2 is a reference for the same camera object as remote1
//          remote1.play(); //output = remote1 is playing video
//          remote2.play(); //output = remote1 is playing video
//          remote2.stop(); //output = remote1 is stopping video play
//          
//          System.out.println("");
//          TV remote3 = new TV();
//          remote3.name = "Remote3";
//          remote1.menu(); //same method as below but referencing different object types
//          remote3.menu();


//          EXAMPLE3: REFER TO SHIRT CLASS DECLARATION BELOW MAIN METHOD
//          References and objects in memory
//            int counter = 10;
//            Shirt myShirt = new Shirt(); //object sits in heap memory but reference to it sits in stack memory
//            Shirt yourShirt = new Shirt(); //object sits in heap memory but reference to it sits in stack memory
//            
//
//            myShirt = yourShirt; //myShirt reference drops its object in the heap
//            //myShirt reference & yourShirt reference point to same object now
//            //if no other references for myShirt object exist, it will be later garbage collected
//            
//            
//            myShirt.color = "Red";
//            yourShirt.color = "Green";
//            
//            System.out.println("Shirt color: " + myShirt.color); //output will be Green
  


//          EXAMPLE4: WORKING WITH ARRAYS
//            String[] names = {"Mary", "Bob", "Carlos"};
//            
//            int[] ages = new int[3]; //Arrays are an object type of a class called Array
//            ages[0] = 19;
//            ages[1] = 42;
//            ages[2] = 92;
//            
//            int age = 35; //stored in stack memory 
//            //int ages array would have a reference in the stack and the actual array object in the heap memory
      

//          EXAMPLE5: REFER TO ITEM CLASS DECLARATION BELOW MAIN METHOD
//          STORING ARRAY OF OBJECT REFERENCES IN MEMORY
//            Item item = new Item(); 
//            Item[] items = {new Item(), new Item(), new Item()};
//            
// for item object above, reference is in stack and object is in heap
// for items array above, reference to array is in stack,...
//...reference to each element in the array is in heap...
//...and objects for each array are also in heap
            
            
          
          
    }
    
}


class Customer {
//    Fields/Properties
    public String name = "Junior Duke";
    public int custID = 1205;
    public String address;
    public int orderNum;
    public int age;
    
//    Methods/Behaviors
    public void displayCustomer() {
        System.out.println("Customer: " + name);  
    }  
    
}


class Camera {
public String name;

public void play() {
    System.out.println(name + " is playing video...");
}

public void stop() {
    System.out.println(name + " is stopping the video play...");
}

public void menu() {
    System.out.println(name + " is displaying the camera's menu...");    
}
}


class TV {
    public String name;
    
    public void menu() {
        System.out.println(name + " is displaying the TV menu...");       
    }
}

class Shirt {
    public String name;
    public String color; 
}

class Item {
    public String name;
    public double price;
    public String color;
}