/**
 * Logical Operators
 * -----------------
 * &(AND) --> both  operands are true,
 * |(OR) --> either operand is true ,
 * ^ (XOR) --> both operands are different
 *
 * Short Circuit Operators
 * -----------------------
 * &&
 * ||
 *
 */
public class LogicalVsConditional {
    public static void main(String[] args) {

        int z = 6;
        if(z>=6 | ++z>= 7){//evaluates both sides
            System.out.println(z);//7
        }

        z = 6;
        if(z>=6 || ++z>= 7){ //if  LHS is true then doesnt evaluates RHS
            System.out.println(z);//6
        }

        Integer f = null;
        if(f!=null && f < 5){//if  LHS is false then doesnt evaluates RHS
            System.out.println("inside");
        }

        if(f!=null & f < 5){ //evaluates both sides
            System.out.println("inside");
        }
    }
}
