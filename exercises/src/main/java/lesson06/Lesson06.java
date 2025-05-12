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

//Creating/Instantiating new object instances of Customer class 
//        Customer customer01 = new Customer();
//        Customer customer02 = new Customer();

//Accessing the fields inside the Customer class and assigning values to each       
//        customer01.age = 40;
//        customer02.name = "Duke";

//Calling Customer class methods on Customer type objects       
//        customer01.displayCustomer();
//        customer02.displayCustomer();
//
//
//
//        EXAMPLE2: REFER TO CAMERA CLASS DECLARATION BELOW MAIN METHOD
//        Working with object references i.e Accessing Objects by Using a Reference
//To work with an object we need to access it by using a reference
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
//References are not limited to a single object type          
//          TV remote3 = new TV();
//          remote3.name = "Remote3";
          
//Same methods are called below but each reference is of a different object types
//Therefore the reference will determine which classes method the object calls upon 
//          remote1.menu(); 
//          remote3.menu();

//          EXAMPLE3: REFER TO SHIRT CLASS DECLARATION BELOW MAIN METHOD
//          References and objects in memory
//Object with its fields/attributes sits in heap memory but the variable reference to it sits in stack memory
            int counter = 10;
            Shirt myShirt = new Shirt(); 
            Shirt yourShirt = new Shirt(); 
//            
//Below we assign myShirt reference to the yourShirt's object
//myShirt reference drops its object in the heap and points to yourShirt's object in heap
//i.e. myShirt reference & yourShirt reference point to same object now
//If no other references for myShirt object exist, it will be later garbage collected
            myShirt = yourShirt; 
                       
//Below we have two references to one object, accessing and changing the color attribute 
//Both outputs will be the same result because they both point to the same object
            myShirt.color = "Red";
            System.out.println("My Shirt color: " + myShirt.color);
            System.out.println("Your Shirt color: " + yourShirt.color);
            
            yourShirt.color = "Green"; 
            System.out.println("\nMy Shirt color: " + myShirt.color); 
            System.out.println("Your Shirt color: " + yourShirt.color);
            
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
//
//          EXAMPLE5: REFER TO ITEM CLASS DECLARATION BELOW MAIN METHOD
//          STORING ARRAY OF OBJECT REFERENCES IN MEMORY
//            Item item = new Item(); 
//            Item[] items = {new Item(), new Item(), new Item()};
//            
// for item object above, reference is in stack and object is in heap
// for items array above, reference to array is in stack,...
//...reference to each element in the array is in heap...
//...and objects for each array are also in heap
    }//end of main method

}//end of Lesson6 Class

//Below is a class declaration for Customers
class Customer {

//NOTES: Classes are blueprints for objects
//They describe an objects properties & behaviours
//They are used to create object instances    
//Fields/Properties of objects
    public String name = "Junior Duke";
    public int custID = 1205;
    public String address;
    public int orderNum = 2;
    public int age;

//    Methods/Behaviors of objects
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
