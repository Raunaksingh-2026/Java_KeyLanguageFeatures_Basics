package javaFeature.a_basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * TOPIC -> Taking Input From User in Java
 * -> This file demonstrates 3 common ways of taking input:
 * 1. System.in.read()
 * -> Reads a single character
 * -> Returns ASCII value
 * -> Throws Checked Exception
 * 2. BufferedReader
 * -> Fast input mechanism
 * -> Reads data as String
 * -> Requires manual conversion for numbers
 * 3. Scanner
 * -> Most beginner-friendly approach
 * -> Can directly read int, double, float, String etc.
 * NOTE -> Scanner is commonly used in interviews and beginner projects.
 * -> BufferedReader is faster and often used in competitive programming.
 */

public class Feature_00_InputFromUser {

/*+++++++++++++++++++++++++++++++++++++ Method 1 -> System.in.read() ++++++++++++++++++++++++++++++++++++*/
    public static void inputUsingSystemRead() throws IOException {
        System.out.println("Taking INPUT From User By Using [ System.in.read() ]");

///        System.in -> Standard Input Stream (Keyboard)
///        System.out -> Standard Output Stream (Console)
        System.out.print("Enter a character : ");
        int asciiValue = System.in.read(); // it can take input from user and return ASCII value for input value [ READ() ] attributes is Going to Throw An Checked Exception which must be handled using [ try-catch ] or [ throws ]
//        System → predefined class in Java
//        in → standard input stream (keyboard)
//        read() → method that reads one character

        System.out.println("ASCII Value = " + asciiValue);

//        System.in.read(); // consume '\r'
//        System.in.read(); // consume '\n'
    }

/**
 IMPORTANT -> System.in.read(), BufferedReader, and Scanner all use the same -> input stream (System.in).
 -> Mixing them in a single execution may leave unwanted characters -> (such as '\n') in the input buffer.
 */
//        System.in.read(); // consume '\r'
//        System.in.read(); // consume '\n'
    /**++++++++++++++++++++++++++ OR ++++++++++++++++++++++++++*/
//        BufferedReader clearBuffer = new BufferedReader(new InputStreamReader(System.in));
//        clearBuffer.readLine();

/*+++++++++++++++++++++++++++++++++++++ METHOD 2 -> [ BufferedReader ] ++++++++++++++++++++++++++++++++++++*/
    public static void inputUsingBufferedReader() throws IOException {
        System.out.println("Taking INPUT From User By Using [ BufferedReader ]");
        BufferedReader clearBuffer = new BufferedReader(new InputStreamReader(System.in));
        clearBuffer.readLine();

//         Take keyboard input (System.in)
//         Convert bytes to characters (InputStreamReader)
//         Read efficiently with buffer (BufferedReader)
//         Store object reference in [ inputStoreInBufferToRead ]
        InputStreamReader inputStreamReader = new InputStreamReader(System.in); // InputStreamReader -> Converts Byte Stream to Character Stream
        BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader); // BufferedReader -> Reads text efficiently using buffer
/**++++++++++++++++++++++++++ OR ++++++++++++++++++++++++++*/
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please Enter Your Name : ");
        String userName = bufferedReader.readLine();

        System.out.print("Please Enter Your Age : ");
        int userAge = Integer.parseInt(bufferedReader.readLine()); // this will return STRING value

//        [ Integer.parseInt() ] -> Converts String -→ int
//        -> Example -> "45" --> 45

        System.out.println("Name : " + userName);
        System.out.println("Age : " + userAge);

///        inputStoreInBufferToRead.close(); // BufferReader is using resource that's why it is best Practice to CLOSE the resource
/**++++++++ Simple Difference +++++++++*/
///        * BufferedReader → just reads data
///        * Scanner → reads + parses data

//        bufferedReader.close();
    }

/*+++++++++++++++++++++++++++++++++++++ METHOD 3 -> Scanner ++++++++++++++++++++++++++++++++++++*/
    public static void inputUsingScanner() {
        System.out.println("Taking INPUT From User By Using [ Scanner ]");

///        Scanner -> Reads and parses different data types
        Scanner scanner = new Scanner(System.in); // CREATING SCANNER OBJECT as "scanner" and can be use in whole program
//        [ Scanner ] → Class for input
//        [ scanner ] → object/reference name | Scanner object
//        [ new Scanner(System.in) ] → creates Scanner object connected to keyboard input
//        [ System.in ] = keyboard input stream.
//        [ nextInt() ] → method to read an integer
//        [ int age ] → stores that integer in variable age

        System.out.print("Enter Roll Number : ");
        int rollNumber = scanner.nextInt();

///        [nextInt()] leaves newline character (\n) in the input buffer.
//        --> Therefore consume it before [ nextLine() ].
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter Student Name : ");
        String studentName = scanner.nextLine();

        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Student Name : " + studentName);

    /******************* Reading Different Data Types Using Scanner *******************/
        System.out.print("WHAT'S YOUR NAME : \t");
        String name = scanner.nextLine().toUpperCase();

        System.out.print("WHAT'S YOUR AGE : \t");
        short age = scanner.nextShort();

        System.out.print("WHAT'S YOUR SALARY : \t");
        double salary = scanner.nextDouble();

        System.out.print("WHAT'S YOUR PERCENTAGE : \t");
        float percentage = scanner.nextFloat();

        System.out.println("YOUR NAME IS :- \tMR." + name);
        System.out.println("YOUR AGE IS :- \t" + age);
        System.out.println("YOUR SALARY IS :- \t$" + salary);
        System.out.println("YOUR PERCENTAGE IS :- \t" + percentage + "%");
/**
     Common Scanner Methods->
         * next()       -> Reads single word
         * nextLine()   -> Reads full line
         * nextInt()    -> Reads int
         * nextDouble() -> Reads double
         * nextFloat()  -> Reads float
         * nextByte()   -> Reads byte
         * nextLong()   -> Reads long
         * nextBoolean()-> Reads boolean
 */
//        close() -> Releases resource after use
        scanner.close(); // [ Scanner ] is using resource that's why it is best Practice to CLOSE the resource
    }

    public static void main(String[] args) throws IOException { // here we Throws the Exception to be handled by JDK

        System.out.println("Understand different approaches for taking user input in Java. ");

        inputUsingSystemRead();
        inputUsingBufferedReader();
        inputUsingScanner();

        System.out.println("\n******* END OF PROGRAM ******");
    }
}
