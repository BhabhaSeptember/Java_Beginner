
package ex08_1_exercise;
//In the Item class:
//1. Declare a setColor method that takes a char as an argument (a color code)
//     and returns a boolean.
//     Return false if the colorCode is ' '.
//     Otherwise, assign the colorCode to the color field and return true.

public class Item {
    char color;
    
    // declare and code the setColor method
    public boolean setColor(char colorCode) {
        if (colorCode == ' ') {
            return false;
        } else {
            this.color = colorCode;
            return true;
        }
    }
    
}
