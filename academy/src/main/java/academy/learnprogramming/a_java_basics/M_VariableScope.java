package academy.learnprogramming.a_java_basics;

public class M_VariableScope {

    static int myNewInt = 5; //class field or global variable, can be used anywhere in the class

    public static void main(String[] args) {
        int myLocalInt = 10; //only available in main method

        myMethod();

        {
            {
                int myOtherInt = 10; //available for all internal blocks but not for outside
                {
                    //int myOtherInt = 20; //does not compile, two variables with same name
                }
            }
            int myOtherInt = 20; //only available in the code block
            int anotherInt = 30;
            System.out.println("myOtherInt = " + myOtherInt); //myOtherInt = 20
            System.out.println("inCodeBlock myLocalInt = " + myLocalInt); //inCodeBlock myLocalInt = 10
        }

        //System.out.println("myOtherInt = " + myOtherInt); //does not compile, does not have access to the code block variables
        System.out.println("myLocalInt = " + myLocalInt); //myLocalInt = 10
        System.out.println("myNewInt = " + myNewInt); //myNewInt = 5

        //System.out.println("myOtherInt = " + myOtherInt); //does not compile, can't use a variable before it is declared

        int myOtherInt = 30;
        int anotherInt = 40;

        System.out.println("myOtherInt = " + myOtherInt); //myOtherInt = 30
        System.out.println("anotherInt = " + anotherInt); //anotherInt = 40
    }

    public static void myMethod() {
        //does not have access to myLocalInt
        //has access to myNewInt
        System.out.println("myMethod myNewInt = " + myNewInt); //myMethod myNewInt = 5
    }
}
