package javaFeature.b_string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
String -> is a sequence of characters used to store and manipulate text.
    IMPORTANT ->
    -> String objects are IMMUTABLE.
    -> Once created, their value cannot be changed.
    -> Any modification creates a NEW String object.
    CREATION METHODS:
     1. String Literal
     2. new String()

    COMMON INTERVIEW QUESTIONS:
    -> Difference between == and equals()
    -> String Constant Pool
    -> String Immutability
    -> String vs StringBuilder
 */

public class Feature_01_StringBasics {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        /***************** Creating String ********************/
        String str1 = "Hello"; // Using String Literal
///        here value of two sting is SAME that why Java doesn't create ANOTHER object it simply points single object by both REFERENCES
        String str2 = "Hello"; // Reuses same object from String Pool
        String city = new String("Lucknow"); // Using NEW keyword --> Heap Object
///        here value of two sting is SAME unlike creation of STRING by using LITERALS Java create ANOTHER object, and they point by respected  REFERENCES
        String homeCity = new String("London");
        /***************** printing String *********************/
        System.out.println("Method 1 -> " + str1);
        System.out.println("Method 2 -> " + city);

     /*
        String Literals are stored inside String Pool.
        If same literal already exists:
            -> Java reuses existing object.
        Therefore:
            str1 and str2 point to same object.
     */
        System.out.println("\n+++++ String Pool +++++");
        System.out.println(str1 == str2);     // true

        /************  comparing two string *************/
        System.out.println("\n+++++ String Comparison +++++");
//        ==      -> compares REFERENCES
//        equals() -> compares VALUES

///       1 -> by using comparator [ == ] -> checks if both REFERENCE point to same Object >> gives [ True ] otherwise >> gives [ FALSE ]
        System.out.println("Is '" + str1 + "' equal to '"+ str2 + "' : " + (str1 == str2)); // here both references points to same object which gives -> TRUE
        System.out.println("Is '" + city + "' equal to '"+ homeCity + "' : " + (city == homeCity));

        System.out.println(city == homeCity); // here both references points to different object which gives -> FALSE

///       2 -> by using METHOD [ EQUAL() ] -> checks only the value not pointing object by REFERENCES
        System.out.println("str1.equals(str2) : " + str1.equals(str2));
        System.out.println("city.equals(homeCity) : " + city.equals(homeCity));

        System.out.println("\n+++++ String Immutability +++++");
        String userName = "Raunak";
        userName.concat(" Singh");
        System.out.println(userName);

        userName = userName.concat(" Singh");
        System.out.println(userName);

        /************  Methods of string *************/
        System.out.println("\n+++++ String Methods +++++");
        Integer ageOfPerson = new Integer(23);
        System.out.println(ageOfPerson.toString()); /// here [ toSting() ] method convert any object in STRING formate
        System.out.println(ageOfPerson); /// there is no need for [ toString() ] because java done this internally

        System.out.println("Length      : " + city.length());
        System.out.println("Upper Case  : " + city.toUpperCase());
        System.out.println("Lower Case  : " + city.toLowerCase());

        System.out.println("Character at [2] : " + city.charAt(2));
        System.out.println("Substring   : " + city.substring(0, 4));

        System.out.println("Is Contains [Luck] : " + city.contains("Luck"));
        System.out.println("Is StartsWith [Luck] : " + city.startsWith("Luck"));
        System.out.println("Is EndsWith [Luck]   : " + city.endsWith("Luck"));

        System.out.println("Replace     : " + city.replace("Luck", "Kan"));

        System.out.println("\n+++++ compareTo() +++++");
    /*
        compareTo() performs lexicographical comparison

        Positive -> First String is larger
        Negative -> Second String is larger
        Zero     -> Both Strings are equal
     */
        System.out.println("city.compareTo(homeCity) : " + city.compareTo(homeCity));
        System.out.println("homeCity.compareTo(city) : " + homeCity.compareTo(city));

        /************ Concatenation operation *************/
        System.out.println("\n+++++ concatenation +++++");
        System.out.println(str1.concat(" ").concat(city));

        System.out.println("a + b     : " + (a + b)); // adding value of [ a ] to value of [ b ] -> 10 + 20 = 30
        System.out.println("'a' + 'b' : " + ('a' + 'b')); // adding ASCII value of [ a ] and [ b ] -> 97 + 98 = 195
        System.out.println("'a' + b   : " + ('a' + b)); // adding ASCII value of [ a ] and value of[ b ] -> 97 + 20 = 117
        System.out.println("(char)('a' + b) : " + (char)('a' + b)); // adding ASCII value of [ a ] and value of[ b ] -> converted to CHARACTER -> 97 + 98 = 195 -> [ u ]
        System.out.println("\"a\" + \"b\" : " + ("a" + "b")); // CONCAT String[ a ] to String[ b ] -> a + b = ab
        System.out.println("\"a\" + b   : "+ ("a" + b)); // CONCAT String[ a ] to value of[ b ] -> internally value of[ b ] in converter to Integer WRAPPER class then convert toString() then concatenate ->  a + 20 = a20

        /************ String to CharArrays *************/
        System.out.println(Arrays.toString(city.toCharArray())); /// String -> toCharArray() -> char[] -> Arrays.toString() -> Readable Output

        /************ Concatenation operation on Object and String *************/
        List<String> fruitsName1 = new ArrayList<>(Collections.singleton("Apple"));
        List<String> fruitsName2 = new ArrayList<>(List.of("Mango", "Banana", "Apple"));
        fruitsName1.add("Guava");
        System.out.println("\n+++++ Object Concatenation +++++");

        System.out.println("Fruits1 : " + fruitsName1);
        System.out.println("Fruits2 : " + fruitsName2); /// CONCATENATE String[ Fruits2 ] to OBJECT -> internally Object is converted into String -> Fruits :  + [Mango, Banana, Apple] = fruits : [Mango, Banana, Apple]

///        we cannot concatenate two object without using String in between
//        System.out.println(fruitsName1 + fruitsName2); /// OBJECT + OBJECT -> INVALID
        System.out.println(fruitsName1 + " -> " + fruitsName2); /// OBJECT + STRING + OBJECT -> VALID
    }
}
