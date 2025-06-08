package ch3;

class Hobbits {
  String name;

//The array has a size of 3 elements 
  public static void main(String[] args) {
    Hobbits[] h = new Hobbits[3];
    int z = -1; //fixed line of code
 
//Changing condition to accomodate size of array which ends with index 2    
    while (z < 2) { //fixed line of code
//initializing int z above to -1 ensures we start inserting at index 0
      z = z + 1; 
      h[z] = new Hobbits();
      h[z].name = "bilbo";
      if (z == 1) {
        h[z].name = "frodo";
      }
      if (z == 2) {
        h[z].name = "sam";
      }
      System.out.print(h[z].name + " is a ");
      System.out.println("good Hobbit name");
    }
  }
}