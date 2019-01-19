/**
 * There are four types of variable
 *  Static  - same for all objects
 *  Instance - unique for each object
 *  Parameter - pass the value into method from outside
 *  Local - inside the method only
 *
 *  Local variables dont have default value. We have to initialize them before use
 *
 *  String[] args in the main method holds an array of 0 length (new String[0])
 */
public class VariablesTypes {

    //Static/Class variable
    static int myStatic; //0
    //Instance Variable
    int myinstance;//0

    public static void main(String[] args /*parameter*/) {// new String[0]
        System.out.println(myStatic);

        VariablesTypes obj = new VariablesTypes();
        System.out.println(obj.myinstance);

        int myLocal;
        myLocal = 2;
        System.out.println(myLocal);

        System.out.println(args);// [L (array), java.lang.String (type), @1a23554b (hashcode)
        System.out.println(args.length);

        obj.checkParameter1(new String[0]);
        obj.checkParameter1(null);
    }

    public void checkParameter1(String[] myArgs){
        System.out.println(myArgs);
        System.out.println(myArgs.length);
    }
}
