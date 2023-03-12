package academy.learnprogramming.a_java_basics; // package declaration always first

//import a.b.c.d.*;
//import a.b.c.d.MyClass;

import java.util.Random;

//import java.lang.System;

public class D_PackagesAndImports {

    public static void main(String[] args) {

        //MyClass myClass
        //ExampleClass

        Random random = new Random();

        //System class is inside of java.lang package and is imported automatically
        System.out.println(random.nextInt(5));
    }
}