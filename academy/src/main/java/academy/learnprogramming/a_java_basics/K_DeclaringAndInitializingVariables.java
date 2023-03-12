package academy.learnprogramming.a_java_basics;

public class K_DeclaringAndInitializingVariables {

    public static void main(String[] args) {
        // declaring and initializing in two lines
        int myNumber; // declaration (type and name)
        //System.out.println("myNumber = " + myNumber); //does not compile, not initialized
        myNumber = 10; // initialization
        System.out.println("myNumber = " + myNumber); //myNumber = 10

        // one line
        double myDouble = 7.50;
        System.out.println("myDouble = " + myDouble); //myDouble = 7.50

        float myFloat1, myFloat2, myFloat3;
        float myFloat4; float myFloat5;

        float myFloat6 = 5f, myFloat7 = 10f, myFloat;
        boolean b1, b2;

        //double d1, double d2; //does not compile

        int i1;
        int i2;
        //int i3; i4; //does not compile, not in the same statement

        //int int = 10; //does not compile
        char cHaR;
        char Char;

        float okFloat;
        double $okDouble1;
        double _alsoDouble;
        float _OkButNotNice$_123;

        // illegal examples
        //double 3Dpoint; //does not compile, variable names can't start with number
        //double 3point; //does not compile, variable names can't start with number
        //double my@street; //does not compile, variable names can't have @
        //float *$coffee; //does not compile, variable names can't have *
        //float double; //does not compile, variable names can't have reserved words
        //double public; //does not compile, variable names can't have reserved words
    }
}
