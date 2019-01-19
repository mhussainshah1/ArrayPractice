/**
 * wrapper classes convert into primitive types before operation
 *
 */
public class PrimitiveWithWrapper {

    public static void main(String[] args) {
        Integer x = 1,
                y = new Integer(2);
        int z = 3;

        Integer sum = x + y; //3

        System.out.println(x + y + z);
        System.out.println(sum);
    }
}
