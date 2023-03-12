package academy.learnprogramming.a_java_basics;

public class O_UnderstandingNull {

    static Object myObject = new Object();
    static Object myOtherObject2 = null;
    static Object myOtherObject;

    static String myString;

    public static void main(String[] args) {
        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";
        String anotherName = null;

        System.out.println("myObject = " + myObject); //myObject = java.lang.Object@4c873330
        System.out.println("myOtherObject = " + myOtherObject); //myOtherObject = null

        System.out.println("myLocalObject = " + myLocalObject); //myLocalObject = java.lang.Object@119d7047
        //System.out.println("anotherLocalObject = " + anotherLocalObject); //does not compile, not initialized

        System.out.println("name = " + name); //name = Java
        System.out.println("anotherName = " + anotherName); //anotherName = null

        System.out.println("myString = " + myString); //myString = null
        //myString.toLowerCase(); //NullPointerException
        /*
            Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()"
            because "academy.learnprogramming.a_java_basics.O_UnderstandingNull.myString" is null
	        at academy.learnprogramming.a_java_basics.O_UnderstandingNull.main(O_UnderstandingNull.java:27)

            Process finished with exit code 1
         */

        myString = "Java";

        myString.toLowerCase();

        System.out.println("myString = " + myString); //myString = Java
    }
}
