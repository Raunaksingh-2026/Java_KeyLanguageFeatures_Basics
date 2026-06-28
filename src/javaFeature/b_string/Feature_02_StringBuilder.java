package javaFeature.b_string;

/**
StringBuilder is a mutable sequence of characters.
    -> String objects are IMMUTABLE.
    -> Every modification on String creates a NEW object.
                    BUT
    --> StringBuilder modifies the SAME object.
    Advantages ->
        -> Faster than String
        -> Less Memory Usage
        -> Best for Frequent String Modification
    Common Methods ->
        append()      -> Add data
        insert()      -> Insert at index
        replace()     -> Replace characters
        delete()      -> Delete range
        reverse()     -> Reverse String
        charAt()      -> Character at index
        setCharAt()   -> Modify one character
        indexOf()     -> Find substring
        length()      -> Number of characters
        capacity()    -> Current buffer size
        toString()    -> Convert to String
*/
public class Feature_02_StringBuilder {
    static void main(String[] args) {

        /***************** Creating StringBuilder ********************/
//        StringBuilder Method used to adding text to string
        StringBuilder stringBuilder = new StringBuilder();
//        append() -> Adds data at the end of existing StringBuilder.
        stringBuilder.append("Mango ");
        stringBuilder.append("Banana ");

        /***************** Printing StringBuilder ********************/
        System.out.println("Its STRING BUILDER -> " + stringBuilder);

        /***************** Creating String by converting StringBuilder to String ********************/
///        STRING BUILDER → STRING
        System.out.println("Converting STRING BUILDER → STRING ");

///        toString() -> Converts mutable StringBuilder --> into immutable String.
        String stringBuilderString = stringBuilder.toString();
        System.out.println("Its STRING Now -> " + stringBuilderString);
        System.out.println();

        /***************** Modifying String and StringBuilder ********************/
///        StringBuilder -> Same object gets modified.
        System.out.println("Apply Append Methods on StringBuilder");
        stringBuilder.append("Apple ");

        System.out.println("No Method like Append Available");
///        String -> New object gets created.
        stringBuilderString = "Apple ";

        /***************** Reprinting String and StringBuilder ********************/
        System.out.println("Its STRING BUILDER -> " + stringBuilder); /// same String object is updated
        System.out.println("Its STRING -> " + stringBuilderString); /// new String object is created
        System.out.println();

        /***************** Some StringBuilder method ********************/

//        append() -> Can append --> int, double, char, boolean, String, Object
        System.out.println("Appending Integer Value  : 43");
        stringBuilder.append(43); // we can add integer value

        System.out.println("Appending Boolean Value  : True");
        stringBuilder.append(" " + true); // we can add boolean value
        System.out.println("New String Builder       : " + stringBuilder + "\n");

        System.out.println("Insert \"आम \" at INDEX   : 6" );
        stringBuilder.insert(6, "आम ");
        System.out.println("New String Builder       : " + stringBuilder + "\n");

        System.out.println("Replacing value of       : ");

        System.out.println("New String Builder       : " + stringBuilder + "\n");

        System.out.println("Delete Character At      : 5 to 8 " );
        stringBuilder.delete(5, 8);
        System.out.println("New String Builder       : " + stringBuilder + "\n");

        System.out.println("Length of stringBuilder   : " + stringBuilder.length()); /// to get length of String
///        Default Capacity = 16
///        Formula -> New Capacity = (oldCapacity × 2) + 2
        System.out.println("Capacity of stringBuilder : " + stringBuilder.capacity()); /// to get Size of Current Buffer

        System.out.println("Index of \"ple\"            : " +stringBuilder.indexOf("ple")); // to get index of argument
        System.out.println("Character at INDEX 6      : " + stringBuilder.charAt(6)); // Return character at given index

///        System.out.println(stringBuilder.reverse()); // we can reverse the given String
    }
}
