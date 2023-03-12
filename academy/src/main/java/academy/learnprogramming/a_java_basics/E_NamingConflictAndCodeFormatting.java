package academy.learnprogramming.a_java_basics;

//import java.util.Date;
//import java.util.*;
//import java.sql.*;

import java.util.List;

public class E_NamingConflictAndCodeFormatting {

    public static void main(String[] args) {
        //Date date;
        java.util.Date date;

        java.sql.Date sqlDate;

        //Main
        // can't import classes from default packages
    }

    public void checkEmpty(List list) {
        if (list.isEmpty()) { System.out.println("empty");
        } else { System.out.println("not empty");
        } }

    public class LineNumbers {
        public void checkEmpty(List list) {
            if (list.isEmpty()) { System.out.println("empty");
            } else { System.out.println("not empty");
            } } }
}
