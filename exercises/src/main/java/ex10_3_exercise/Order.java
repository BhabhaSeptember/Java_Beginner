package ex10_3_exercise;

//In the Order class:
//1. Rewrite the calcDiscount code using a switch statement.  
//     Use a ternary expression to replace the nested if logic.
//     For better performance, use a break statement in each case block.
//     Include a default block to handle invalid custType values.
public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    static final char UNKNOWN = 'U';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    public void calcDiscount() {
        // Replace the if logic with a switch statement.

//        if (custType == NONPROFIT) {
//            if (total > 900) {
//                discount = 10.00;
//            } else {
//                discount = 8.00;
//            }
//        } else if (custType == PRIVATE) {
//            if (total > 900) {
//                discount = 7.00;
//            } else {
//                discount = 0.00;
//            }
//        } else if (custType == CORP) {
//            if (total > 500) {
//                discount = 8.00;
//            } else {
//                discount = 5.00;
//            }
//        }  
        switch (custType) {
            case 'N':
                discount = (total > 900) ? 10.00 : 8.00;
                break;
            case 'P':
                discount = (total > 900) ? 7.00 : 0;
                break;
            case 'C':
                discount = (total > 500) ? 8.00 : 5.00;
                break;
            default:
                System.out.println("Invalid custType");
        }
    }
}