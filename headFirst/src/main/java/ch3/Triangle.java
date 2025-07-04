package ch3;

class Triangle {

    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        Triangle[] ta = new Triangle[4];

        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }//end of while loop

        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2;
    }
}

//========================================================================

//----- Page 65 Exercise -----

//class Triangle {
//  double area;
//  int height;
//  int length;
//
//  public static void main(String[] args) {
//    int x = 0;
//    Triangle[] ta = new Triangle[4];
//    while ( x < 4 ) {
//    ta[x] = new Triangle();
//      ta[x].height = (x + 1) * 2;
//      ta[x].length = x + 4;
//      ta[x].setArea();
//      System.out.print("triangle " + x + ", area");
//      System.out.println(" = " + ta[x].area);
//      x = x + 1;
//    }
//    int y = x;
//    x = 27;
//    Triangle t5 = ta[2];
//    ta[2].area = 343;
//    System.out.print("y = " + y);
//    System.out.println(", t5 area = " + t5.area);
//  }
//  void setArea() {
//    area = (height * length) / 2;
//  }
//}
//
//
