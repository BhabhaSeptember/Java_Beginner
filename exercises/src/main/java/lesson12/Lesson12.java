/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson12;

/**
 *
 * @author User
 */
public class Lesson12 {
    public static void main(String[] args) {
        
//EXAMPLE1 (IMPLEMENTING INHERITANCE - REFER TO CLOTHING & SHIRT CLASSES BELOW)
//Shirt myShirt = new Shirt();
//myShirt.display();
//myShirt.setSize('S');
//
//myShirt.setNeckSize(7);
//        System.out.println("Neck Size: " + myShirt.getNeckSize());
//
//
//
//EXAMPLE2 (SUPERCLASS & SUBCLASS - REFER TO CLOTHING & SHIRT CLASSES BELOW)
// Shirt shirt01 = new Shirt(101, "V-Neck", 'W', 79.99, 'F');
// shirt01.display();
// 
//
//inheritance & overloaded constructor example
Shirt shirt02 = new Shirt('M'); 
shirt02.display();
shirt02.displayFit();

Shirt shirt03 = new Shirt(89.99, 'F');
shirt03.display();
shirt03.displayFit();

    }//end of main method
    
}//end of Lesson12 class

//============================================ CLOTHING CLASS ============================================
    class Clothing {
//EXAMPLE1        
//        public void display() {
//            System.out.println("- Clothing class display method...");
//        }
//        
//        public void setSize(char size) {
//            System.out.println("Size: " + size);
//        }
//        
//        
//        
//EXAMPLE2 
        //fields
        private int itemID = 0;
        private String desc = "-description required-";
        private char colorCode = 'U';
        private double price = 0.0;
        
        //constructor
        public Clothing(int itemID, String desc, char color, double price) {
            this.itemID = itemID;
            this.desc = desc;
            this.colorCode = color;
            this.price = price;
        }
        
        //inheritance & overloaded constructor example
        public Clothing(double price) {
            this.price = price;
        }
        
        
        
        //methods
        public void display() {
            System.out.println("===== CLOTHING DETAILS =====" +
                    "\nItemID: " + itemID +
                    "\nDescription: " + desc +
                    "\nColor Code: " + colorCode +
                    "\nPrice: R" + price);
        }
        
        
        
    }//end of Clothing class


//============================================ SHIRT CLASS ============================================
class Shirt extends Clothing { 
//EXAMPLE1    
//Clothing class is superclass & Shirt class is subclass
//   subclass may have unique fields and methods not found in superclass
//    private int neckSize; 
//    
//    public int getNeckSize() {     
//        return neckSize;
//    }
//    public void setNeckSize(int nSize) {
//        this.neckSize = nSize;
//    }
//    
//    
//    
//EXAMPLE2
//fields
private char fit = 'U';

//constructor
public Shirt(int itemID, String description, char colorCode, double price, char fit) {
    super(itemID, description, colorCode, price);
    
    this.fit = fit;  
}

//inheritance & overloaded constructor example
public Shirt(char fit) {
    this(29.99, fit); //calls below constructor in its own class
}

public Shirt(double price, char fit) {
    super(price);
    this.fit = fit;  
}


//methods
public char getFit() {
    return fit;
}
public void setFit(char fit) {
    this.fit = fit;
}

public void displayFit() {
    System.out.println("Fit: " + fit);
}

        
        
}//end of Shirt class
