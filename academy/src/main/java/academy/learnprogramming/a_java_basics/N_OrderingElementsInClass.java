//import java.util.Random; //does not compile

package academy.learnprogramming.a_java_basics;

import java.util.*;

//package academy; //does not compile, unexpected token

//int myInt = 10; //does not compile, unexpected token

/*public void myMethod(){ //does not compile, can't have method outside a class
}*/

class MyAnotherClass {}

//public class AnotherClass {} //does not compile, a file can only have one public class

public class N_OrderingElementsInClass {

    /*
    _____________________________________________________________________________________
    |       ELEMENT       |       EXAMPLE       |  REQUIRED?  |    WHERE DOES IT GO?    |
    -------------------------------------------------------------------------------------
    | Package declaration | package abc;        | No          | First in the fill       |
    -------------------------------------------------------------------------------------
    | Import statements   | import java.util.*; | No          | Right after package     |
    -------------------------------------------------------------------------------------
    | Class declaration   | public class C      | Yes         | Right after import      |
    -------------------------------------------------------------------------------------
    | Field declarations  | int myInt;          | No          | Anywhere inside a class |
    -------------------------------------------------------------------------------------
    | Method declarations | void method()       | No          | Anywhere inside a class |
    -------------------------------------------------------------------------------------
     */

    int myInt = 10;

    public static void main(String[] args) {
        int anotherInt = 20;

        //void myMethod() {} //does not compile, can't have a method inside another method
    }

    // PIC (package, import, class)
}
