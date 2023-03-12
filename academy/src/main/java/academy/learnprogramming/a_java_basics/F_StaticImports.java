package academy.learnprogramming.a_java_basics;

import static java.lang.Math.PI;
import static java.lang.Math.min;

import static java.lang.System.out;
/* static imports are used for
 importing static members (variables or methods)
*/
/* regular imports are used for
   importing classes
 */
import static academy.learnprogramming.Config.*;
public class F_StaticImports {

    public static void main(String[] args) {
        /*int min = Math.min(5, 7);
        System.out.println("min = " + min);
        System.out.println(Math.PI);*/

        int min = min(5, 7);
        //System.out.println("min = " + min);
        //System.out.println(PI);
        out.println("min = " + min);
        out.println(PI);

        printConfig();

        out.println("name = " + NAME);
        out.println("columnCount = " + MAX_COLUMN_COUNT);
    }
}
