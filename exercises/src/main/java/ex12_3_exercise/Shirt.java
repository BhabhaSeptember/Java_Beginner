//In the Shirt class:
//1.  Add a public getColor method that converts the colorCode field 
//      into the corresponding color name (example: 'R' = "Red"). Include
//      at least 3 colorCode/color combinations.  
//2.  Use a switch statement in the method and return the color String.
package ex12_3_exercise;

public class Shirt extends Item {

    private char size;
    private char colorCode;

    public Shirt(double price, char size, char colorCode) {
        super("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }

    public void display() {
        super.display();
        System.out.println("Size: " + getSize());
        System.out.println("Color Code: " + getColorCode());
    }

    // Code a public getColor method that converts the colorCode to a the color name
    // Use a switch statement.  Return the color name. 
    public String getColor() {
        switch (this.getColorCode()) {
            case 'R':
                return "Red";

            case 'B':
                return "Blue";

            case 'O':
                return "Orange";

            default:
                return "Ooops, invalid color code!! (Choose 'R', 'B' or 'O') ";

        }
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
