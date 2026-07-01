package javaFeature.c_exceptions;
import java.util.Scanner;
/*++++++++++++++++++++++++++++++++++ Pre Defined Exception Handling ++++++++++++++++++++++++++++++++++++*/
/**
Exception Handling allows a program to handle runtime errors gracefully, without terminating unexpectedly.
    Keywords Used ->
        -> try
        -> catch
        -> finally
        -> throw
        -> throws
    Benefits ->
        -> Prevents abrupt program termination
        -> Maintains normal program flow
        -> Improves reliability
    NOTE -> Exception Handling deals only with Runtime Errors (Exceptions) --> not Compile-Time Errors or Logical Errors.
*/
public class Feature_12_ExceptionHandling {

    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);

        System.out.print("Please Enter Dividend : ");
        int inputFromUser1 = takeInput.nextInt();
        System.out.print("Please Enter Divisor : ");
        int inputFromUser2 = takeInput.nextInt();

/************************ without EXCEPTION HANDLING or TRY-CATCH BLOCKs ************************/
        System.out.println("++++++ without EXCEPTION HANDLING ++++++");
//        int result = 10 / 0; /// Divide by zero
        int quotient1 = inputFromUser1 / inputFromUser2; /// if inputFronUser2 is ZERO '0' then these show "ArithmeticException: / by zero" EXCEPTION and terminate th Program
        System.out.println("Division of Both Number : " + quotient1); // NOT print if EXCEPTION occur

/************************ with EXCEPTION HANDLING or TRY-CATCH BLOCKs ************************/

        /*+++++++++++++++++++++++++ Single CATCH BLOCK ++++++++++++++++++++++++++*/
        System.out.println("\n++++++ EXCEPTION HANDLING Single CATCH BLOCK ++++++");
        try {  /// If Exception Occurred inside Try Block code it will go to gives EXCEPTION but the other program from out of this block is going to RUN as expected
            int quotient2 = inputFromUser1 / inputFromUser2; // if inputFronUser2 is ZERO '0' then these show "ArithmeticException: / by zero" EXCEPTION
            System.out.println("Division Of Both Number : " + quotient2); // NOT print if EXCEPTION occur

        } catch (Exception e) {
            System.out.println("ITS a Problem and EXCEPTION : " + e); // for printing the EXCEPTION DESCRIPTION

        }
        System.out.println("++++++++ THANKs ++++++++ \n");
    }
}
