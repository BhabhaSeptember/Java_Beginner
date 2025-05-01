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
//Shirt shirt02 = new Shirt('M'); 
//shirt02.display();
//shirt02.displayFit();
//
//Shirt shirt03 = new Shirt(89.99, 'F');
//shirt03.display();
//shirt03.displayFit();
//
//
//
//EXAMPLE3 (OVERRIDING METHODS - REFER TO CLOTHING & SHIRT CLASSES BELOW)
//Shirt myShirt = new Shirt(111, "Round Neck", 'Y', 159.99);
//myShirt.display();
//myShirt.setColorCode('R'); //prints both SHIRT METHOD & CLOTHING METHOD outputs
//        System.out.println("Color Code: " + myShirt.getColorCode());
//
//
//
//EXAMPLE4 (POLYMORPHISM)
//1)USING SUPERCLASS AS REFERENCE
//Clothing garment1 = new Shirt(111, "Round Neck", 'Y', 159.99);
//Clothing garment2 = new Socks(112, "Secret Socks", 'W', 100.00);
//Clothing garment3 = new Trousers(113, "Skinny Jeans", 'B', 359.99);
//
//garment1.display();
//garment2.display();
//garment3.display();
//
//
//2)USING SUPERCLASS AS REFERENCE
//        Clothing[] clothes = {new Shirt(), new Socks(), new Trousers()};
//        System.out.println("===== Clothing Array Items =====");
//        clothes[0].setDesc("Golf T-Shirt");
//           clothes[0].getDesc();
//
//        clothes[1].setDesc("Hockey Socks");
//        clothes[1].getDesc();
//
//        clothes[2].setDesc("Bell Bottom Jeans");
//        clothes[2].getDesc();
////
//
//3)POLYMORPHISM APPLIED
//Clothing c1 = new Shirt(111, "Round Neck", 'Y', 159.99);
//Clothing c2 = new Socks(112, "Secret Socks", 'W', 100.00);
//Clothing c3 = new Trousers(113, "Skinny Jeans", 'B', 359.99);
//
//c1.setColorCode('P');
//c1.getColorCode();
//
//
//4)ACCESSING METHODS USING SUPERCLASS REFERENCE
//Clothing c1 = new Trousers();
//System.out.println("ItemID: " + c1.getItemID());
 
//ERROR: method is unique to Trousers class and therefore cannot be accessed by...
//...superclass reference
//c1.getGender(); 
//
//casting from superclass reference type to object reference type... 
//...gives access to object specific methods
//((Trousers)c1).setGender('F');
//((Trousers)c1).getGender();
//
//
//5)INSTANCEOF OPERATOR
//a)
//Clothing c1 = new Trousers();
//((Trousers)c1).setGender('F');
//displayDetails(c1);
//
//
//b)
//Clothing c1 = new Socks();
//displayDetails2(c1);
//
//
//
//EXAMPLE5 (ABSTRACT CLASSES)




    }//end of main method
    
    //EXAMPLE4 (POLYMORPHISM - INSTANCEOF OPERATOR)  
//1)
       public static void displayDetails(Clothing c1) {
        c1.display();
        char gender = ((Trousers)c1).getGender();
        System.out.println("Gender: " + gender);
    }//end of syntax-1
//    
//       
//2)
       public static void displayDetails2(Clothing c1) {
           c1.display();
           if (c1 instanceof Trousers) {
           char gender = ((Trousers)c1).getGender();
           System.out.println("Gender: " + gender);
       } else {
               System.out.println("Cannot access getGender method. This object is not an instance of Trousers class");
               }
       }//end of syntax-2
    

}//end of Lesson12 class

//============================================ CLOTHING CLASS ============================================
class Clothing {
//EXAMPLE1 (IMPLEMENTING INHERITANCE)        
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
//EXAMPLE2 (SUPERCLASSES & SUBCLASSES)
    //fields
//        private int itemID = 0;
//        private String desc = "-description required-";
//        private char colorCode = 'U';
//        private double price = 0.0;

    //constructor
//        public Clothing(int itemID, String desc, char color, double price) {
//            this.itemID = itemID;
//            this.desc = desc;
//            this.colorCode = color;
//            this.price = price;
//        }
    //inheritance & overloaded constructor example
//        public Clothing(double price) {
//            this.price = price;
//        }
//        
    //methods
//        public void display() {
//            System.out.println("===== CLOTHING DETAILS =====" +
//                    "\nItemID: " + itemID +
//                    "\nDescription: " + desc +
//                    "\nColor Code: " + colorCode +
//                    "\nPrice: R" + price);
//        }
//        
//        
//        
//EXAMPLE3 (OVERRIDING METHODS)      
//fields
    private int itemID = 0;
    private String desc = "-description required-";
    private char colorCode = 'U';
    private double price = 0.0;

//constructor
    public Clothing() {
    }
//
    public Clothing(int itemID, String desc, char color, double price) {
        this.itemID = itemID;
        this.desc = desc;
        this.colorCode = color;
        this.price = price;
    }

//methods
    public void display() {
        System.out.println("===== CLOTHING DISPLAY METHOD =====");
        System.out.println("Item ID: " + getItemID());
        System.out.println("Item description: " + getDesc());
        System.out.println("Item price: " + getPrice());
        System.out.println("Color code: " + getColorCode());
    }
    
 

    public String getDesc() {
        System.out.println(desc);
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public int getItemID() {
        return itemID;
    }

    public char getColorCode() {
        System.out.println("Color Code: " + colorCode);
        return colorCode;
    }

    protected void setColorCode(char color) {
        System.out.println("===== CLOTHING METHOD =====");
        this.colorCode = color;
    }
    
}//end of first Clothing class

//============================================ ABSTRACT CLOTHING CLASS ============================================
//EXAMPLE5 (ABSTRACT CLASSES)
//NOTE: abstract classes cannot be instantiated
abstract class Clothing2 {
    private int id;
    
    public int getID() { //concrete methods that do not have to be implemented by subclasses
        return id;
    }
    
    protected abstract double getPrice(); //method must be implemented by its non-abstract subclasses
    public abstract void display(); //method must be implemented by its non-abstract subclasses
    
}//end of Clothing2 class


//============================================ SHIRT CLASS ============================================
class Shirt extends Clothing {
//EXAMPLE1 (IMPLEMENTING INHERITANCE)   
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
//EXAMPLE2 (SUPERCLASSES & SUBCLASSES)
//fields
//private char fit = 'U';

//constructor
//public Shirt(int itemID, String description, char colorCode, double price, char fit) {
//    super(itemID, description, colorCode, price);
//    
//    this.fit = fit;  
//}
//inheritance & overloaded constructor example
//public Shirt(char fit) {
//    this(29.99, fit); //calls below constructor in its own class
//}
//public Shirt(double price, char fit) {
//    super(price);
//    this.fit = fit;  
//}
//methods
//public char getFit() {
//    return fit;
//}
//public void setFit(char fit) {
//    this.fit = fit;
//}
//
//public void displayFit() {
//    System.out.println("Fit: " + fit);
//}
//
//
//
//EXAMPLE3 (OVERRIDING METHODS)
//fields
    private char fit = 'U';

//constructor
    public Shirt() {
    }

    public Shirt(int itemID, String description, char colorCode, double price) {
        super(itemID, description, colorCode, price);
    }

    public Shirt(int itemID, String description, char colorCode, double price, char fit) {
        super(itemID, description, colorCode, price);
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

    @Override
    public void display() {
        System.out.println("===== SHIRT DISPLAY METHOD =====");
        System.out.println("Item ID: " + getItemID());
        System.out.println("Item description: " + getDesc());
        System.out.println("Item price: " + getPrice());
        System.out.println("Color code: " + getColorCode());
        System.out.println("Fit: " + getFit());
    }

    @Override
    protected void setColorCode(char colorCode) {
        System.out.println("===== SHIRT METHOD =====");
        super.setColorCode(colorCode);
    }

}//end of Shirt class

//============================================ SOCKS CLASS ============================================
//1)
//class Socks extends Clothing {
//
//    public Socks() {
//    }
//
//    public Socks(int itemID, String description, char colorCode, double price) {
//        super(itemID, description, colorCode, price);
//    }
//
//}//end of Socks class
//
//2) ABSTRACT CLASSES EXAMPLE
class Socks extends Clothing2 {
    private double price;
    
    //Clothing2 abstract methods being implemented in subclass
    protected double getPrice() { 
        return price;
    }
    
    public void display() {
        System.out.println("ID: " + getID());
        System.out.println("Price: R" + getPrice());
    }
    
}//end of second Socks class


//============================================ TROUSERS CLASS ============================================

class Trousers extends Clothing {

    private char gender; 

    public Trousers() {
    }

    public Trousers(int itemID, String description, char colorCode, double price) {
        super(itemID, description, colorCode, price);
    }
    
    
//methods
     public char getGender() {
//        System.out.println("Gender: " + gender);
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    


}//end of Trousers class
