package academy.learnprogramming.a_java_basics;

/**
 * Java doc
 */
public class B_MainMethod {
    //psvm

    /**
     * This is main method.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        //sout
        System.out.println("args-size = " + args.length);

        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }

        sum(1, 2);
    }

    /**
     * Calculate sum of two intergers.
     * @param a operand
     * @param b operand
     * @return sum
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
