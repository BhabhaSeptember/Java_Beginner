/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch3;

/**
 *
 * @author User
 */
public class BooksTestDrive {
    public static void main(String[] args) {
    Books[] myBooks = new Books[3];
    
    int x = 0;
    
//Previously the reference variables in the array were null 
//They were not referencing any object so no access to class instance variables
    myBooks[0] = new Books(); //added line of code
    myBooks[1] = new Books(); //added line of code
    myBooks[2] = new Books(); //added line of code
    
    myBooks[0].title = "The Grapes of Java";
    myBooks[1].title = "The Java Gatsby";
    myBooks[2].title = "The Java Cookbook";
    
    myBooks[0].author = "bob";
    myBooks[1].author = "sue";
    myBooks[2].author = "ian";

    while (x < 3) {
      System.out.print(myBooks[x].title);
      System.out.print(" by ");
      System.out.println(myBooks[x].author);
      x = x + 1;
    }
  }
}
