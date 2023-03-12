package academy.learnprogramming.a_java_basics;

public class L_DefaultInitializationPrimitives {

    static boolean myBoolean;
    static byte myByte;
    static short myShort;
    static int myInt;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;

    public static void main(String[] args) {
        int localInt; // local variable (a variable that is declared in a method)

        //System.out.println("localInt = " + localInt); // does not compile, local variables are not initialized

        System.out.println("myBoolean = " + myBoolean); //myBoolean = false
        System.out.println("myByte = " + myByte); //myByte = 0
        System.out.println("myShort = " + myShort); //myShort = 0
        System.out.println("myInt = " + myInt); //myInt = 0
        System.out.println("myLong = " + myLong); //myLong = 0
        System.out.println("myFloat = " + myFloat); //myFloat = 0.0
        System.out.println("myDouble = " + myDouble); //myDouble = 0.0
        System.out.println("myChar = " + myChar); //myChar = ""
    }
}
