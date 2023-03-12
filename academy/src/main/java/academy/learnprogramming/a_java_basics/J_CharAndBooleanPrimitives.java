package academy.learnprogramming.a_java_basics;

public class J_CharAndBooleanPrimitives {

    public static void main(String[] args) {
        char ch = 'a';

        //char ch1 = 'ab'; //does not compile, too many characters
        char ch1 = '1';

        //unicode characters from ASC table
        char uniChar = '\u03A9'; // uppercase greek omega character
        char romanNumber = '\u216C'; // roman 50 number

        System.out.println("ch1 = " + ch1);
        System.out.println("uniChar = " + uniChar);
        System.out.println("romanNumber = " + romanNumber);
        /*
        ch1 = 1
        uniChar = Ω
        romanNumber = Ⅼ
         */

        boolean myBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myFalseBoolean = " + myFalseBoolean);
        /*
        myBoolean = true
        myFalseBoolean = false
         */

        //boolean true = false; //does not compile, true is a reserved word
        boolean true1 = false;
    }
}
