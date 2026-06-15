package javaFeature.a_basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
TOPIC -> Taking Input From User in Java
    -> This file demonstrates 3 common ways of taking input:
        1. System.in.read()
            -> Reads a single character
            -> Returns ASCII value
            -> Throws Checked Exception
        2. BufferedReader
            -> Fast input mechanism
            -> Reads data as String
            -> Requires manual conversion for numbers
        3. Scanner
            -> Most beginner-friendly approach
            -> Can directly read int, double, float, String etc.
    NOTE -> Scanner is commonly used in interviews and beginner projects.
        -> BufferedReader is faster and often used in competitive programming.
 */

public class Feature_00_InputFromUser {
    public static void main(String[] args) throws IOException {//here we Throws the Exception to be handled by JDK
//        System.out.println("Please Enter here : ");

        /*+++++++++++++++++++++++++++++++++++++ Method 1 -> System.in.read() ++++++++++++++++++++++++++++++++++++*/
        System.out.println("Taking INPUT From User By Using [ System.in.read() ]");
        System.out.print("Enter a character : ");
        int asciiValue = System.in.read(); // it can take input from user and return ASCII value for input value [ READ() ] attributes is Going to Throw An Checked Exception which must be handled
//        System → predefined class in Java
//        in → standard input stream (keyboard)
//        read() → method that reads one character

        System.out.println("ASCII Value = " + asciiValue);

        /*+++++++++++++++++++++++++++++++++++++ METHOD 2 -> [ BufferedReader ] ++++++++++++++++++++++++++++++++++++*/
        System.out.println("Taking INPUT From User By Using [ BufferedReader ]");
//         Take keyboard input (System.in)
//         Convert bytes to characters (InputStreamReader)
//         Read efficiently with buffer (BufferedReader)
//         Store object reference in [ inputStoreInBufferToRead ]

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader);
/**++++++++++++++++++++++++++ OR ++++++++++++++++++++++++++*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please Enter Any String");
        String userName = bufferedReader.readLine();
        System.out.println("Please Enter Any Number");
        int userAge = Integer.parseInt(bufferedReader.readLine()); // this will return STRING value

//        [ Integer.parseInt() ] -> Converts String -→ int
//        -> Example -> "45" --> 45

        System.out.println("Name : " + userName);
        System.out.println("Age : " + userAge);

//        inputStoreInBufferToRead.close(); // BufferReader is using resource that's why it is best Practice to CLOSE the resource
         /**++++++++ Simple Difference +++++++++*/
///        * BufferedReader → just reads data
///        * Scanner → reads + parses data

        /*+++++++++++++++++++++++++++++++++++++ METHOD 3 -> Scanner ++++++++++++++++++++++++++++++++++++*/

        // NEXT DAY
    }
}
