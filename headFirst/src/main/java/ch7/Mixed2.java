package ch7;

class A {

    int ivar = 7;

    void m1() {
        System.out.print("A's m1, ");
    }

    void m2() {
        System.out.print("A's m2, ");
    }

    void m3() {
        System.out.print("A's m3, ");
    }
}

class B extends A {

    void m1() {
        System.out.print("B's m1, ");
    }
}

class C extends B {

    void m3() {
        System.out.print("C's m3, " + (ivar + 6));
    }
}

public class Mixed2 {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

//candidate goes here
 a2.m1();
 a2.m2();
 a2.m3();
//

    }
}

// ----- Page 194 Exercise -----
//CANDIDATE             OUTPUT
//1)
//b.m1();
//c.m2();
//a.m3();              B's m1, A's m2, A's m3,         
//
//
//2)
//c.m1();
//c.m2();
//c.m3();              B’s m1, A’s m2, C’s m3, 13 
//
//
//3)
//a.m1();
//b.m2();
//c.m3();              A’s m1, A’s m2, C’s m3, 13
//
//
//4)
//a2.m1();
//a2.m2();
//a2.m3();             B’s m1, A’s m2, C’s m3, 13
//
