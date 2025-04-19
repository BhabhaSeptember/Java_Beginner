
package ex10_2_exercise;

//In the ShoppingCart class:
//3. Examine the code.  This class needs no modification.
//4. Run the ShoppingCart to test the order.calcDiscount method. 

public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 1200.00, "VA", Order.NONPROFIT);
        System.out.println("Discount is: "+ order.getDiscount());
        
        Order order1 = new Order("Rob James", 920.00, "TX", Order.PRIVATE);
        System.out.println("Discount is: "+ order1.getDiscount());
        
        Order order2 = new Order("Rick James", 510.00, "CA", Order.CORP);
        System.out.println("Discount is: "+ order2.getDiscount());
       
    }
}
