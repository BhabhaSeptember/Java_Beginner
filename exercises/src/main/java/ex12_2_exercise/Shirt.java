//In the Shirt class:
//1.  Override the display method and do the following:
//	- Call the superclass's display method.
//	- Print the size field and the colorCode field.  
//2.  Run the ShoppingCart class.  Do you see a different 
//      display than you did in the previous exercise?

package ex12_2_exercise;

public class Shirt extends Item {
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    } 
    
    // Override display() in the superclass to also show size and colorCode.
    //   Avoid duplicating code.
    
    @Override
    public void display() {
        super.display();
        System.out.println("\tSize = " + getSize());
        System.out.println("\tColor code = " + getColorCode());
    }

    /**
     * @return the size
     */
    public char getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(char size) {
        this.size = size;
    }

    /**
     * @return the colorCode
     */
    public char getColorCode() {
        return colorCode;
    }

    /**
     * @param colorCode the colorCode to set
     */
    public void setColorCode(char colorCode) {
        this.colorCode = colorCode;
    }
}
