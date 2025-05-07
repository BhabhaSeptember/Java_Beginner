//In the Calculator class:
//1.  Change the divide method signature so that it throws 
//      an ArithmeticException.
        
package ex14_1_exercise;

public class Calculator {
    
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(double x, int y) throws ArithmeticException {
        return x / y;
    }
}
