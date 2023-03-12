package academy.learnprogramming.a_java_basics;

public class I_DecimalNumericPrimitives {

    public static void main(String[] args) {

        //float myNumber = 25.4; //compilation error, incompatible types
        float myNumber = 25.4f;
        float myNumber2 = 25.4F;

        //double before = 10_.25; //compilation error, illegal underscore (can't be before decimal point)
        //double after = 10._25; //compilation error, illegal underscore (can't be after decimal point)
        //double first = _10.25; //compilation error, illegal underscore (can't be the first)
        //double last = 10.25_; //compilation error, illegal underscore (can't be the last)

        double myDouble = 2.54;
        double myDouble2 = 2.54f; //float will be converted to double (2.54)
        double myDouble3 = 2.54F; //float will be converted to double (2.54)
        double anotherDouble = 2.45d; //d is the literal that represents the double, is optional
        double anotherDouble2 = 2.45D; //D is the literal that represents the double, is optional
        double scientificNotation = 5.000125E03; //same as 5000.125
        double myDouble4 = 5000.125;
        double scientificNotation2 = 5.000125E3; //same as 5000.125

        System.out.println("scientificNotation = " + scientificNotation);
        System.out.println("scientificNotation2 = " + scientificNotation);
        System.out.println("myDouble4 = " + myDouble4);
        /*
        scientificNotation = 5000.125
        scientificNotation2 = 5000.125
        myDouble4 = 5000.125
         */

        double hexPi = 0x1.91eb851eb851fp1; // p indicates hexadecimal floating point number

        System.out.println("hexPi = " + hexPi); // hexPi = 3.14
    }
}
