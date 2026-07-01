package javaFeature.c_exceptions;
/**
Java programs can encounter three major categories of errors:
    1. Compile-Time Errors
        -> Detected by the Java Compiler.
        -> Program cannot execute until fixed.

    * 2. Runtime Errors (Exceptions)
        -> Occur while the program is running.
        -> Handled using Exception Handling.
        ✔ Detected by JVM
        ✔ Program starts but crashes

    3. Logical Errors
        -> Program compiles and runs successfully, --> but produces incorrect output or behaves unexpectedly.
        ✔ Compiler finds nothing
        ✔ JVM finds nothing
*/

public class Feature_11_TypesOfErrors {
    public static void main(String[] args) {

        /*+++++++++++++++ COMPILE TIME ERROR +++++++++++++++++++++++*/
///        Compiler prevents the program from running -> until these errors are corrected.

//        int A = 39  // here there is missing of SEMICOLON can cause SYNTAX ERROR
//        B = 34;  // here the VARIABLE is Not DECLARED which cause " cannot find symbol "
//        System.out.printlin("Hello"); // Wrong Method Name

        /*+++++++++++++++ RUN TIME ERRORs (EXCEPTION) +++++++++++++++++++++++*/
///        Program compiles successfully. --> Exception occurs while execution.

        String[] nameOfFruits = new String[4];
        nameOfFruits[0] = "Mango";
        nameOfFruits[1] = "Apple";
        nameOfFruits[3] = "Oranges";
//        nameOfFruits[4] = "Banana"; // here this is going to gives " Index 4 out of bounds for length 4 "
//        System.out.println(fruits[4]);
        for (int i = 0; i < nameOfFruits.length; i++) {
            System.out.print(nameOfFruits[i]);
            System.out.print(" ");
        } ///   --> Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException

///        More Runtime Exceptions -
//            -> ArithmeticException
//            -> NullPointerException
//            -> NumberFormatException
//            -> ClassCastException
//            -> ArrayIndexOutOfBoundsException

        /*+++++++++++++++ LOGICAL ERROR +++++++++++++++++++++++*/
///        Program compiles ✔ -> Program runs ✔ --> Output is Wrong ✘

        int a = 10;
        int b = 20;
        System.out.println(a - b);
///        Expected: Addition
///        Actual: Subtraction

        int i = 1;
        while (i > 0) {  ///  there is no any terminating condition which leads to INFINITE loop
            System.out.println(i);
            i++;
        }
    }
}
