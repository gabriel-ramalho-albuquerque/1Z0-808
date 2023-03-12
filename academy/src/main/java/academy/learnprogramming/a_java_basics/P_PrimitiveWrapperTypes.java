package academy.learnprogramming.a_java_basics;

public class P_PrimitiveWrapperTypes {

    public static void main(String[] args) {
        int myInt = 10;
        Integer myInteger = new Integer(10); //unnecessary boxing, obs: the constructors Integer(int), Double(double), Long(long) and so on are deprecated since version 9
        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.valueOf(10); //unnecessary boxing
        Integer myInteger4 = Integer.parseInt("3");
        Integer myInteger5 = null;
        //int myInt2 = null; //does not compile, int is required, null can't be int

        System.out.println("myInteger = " + myInteger); //myInteger = 10
        System.out.println("myInteger2 = " + myInteger2); //myInteger2 = 20
        System.out.println("myInteger3 = " + myInteger3); //myInteger3 = 10
        System.out.println("myInteger4 = " + myInteger4); //myInteger4 = 3
        System.out.println("myInteger5 = " + myInteger5); //myInteger5 = null

        // autoboxing
        Integer myInteger6 = 10;

        // converting wrapper to primitive -> unboxing
        int myInt3 = myInteger3; //unboxing
        //int myInt4 = myInteger5; //throws NullPointerException, myInteger5 is null and primitives can't contain null

        // converting primitive to wrapper -> boxing
        Integer myInteger7 = Integer.valueOf(10); //boxing
        Integer myInteger8 = myInt; //boxing

        // autoboxing
        printSum(1, 5); //sum = 6

        // not autoboxing
        printSum(myInteger, myInteger2); //sum = 30
    }

    private static void printSum(Integer first, Integer second) {
        System.out.println("sum = " + (first + second));

        Integer sum = first + second;
        System.out.println("sum = " + sum);
    }
}
