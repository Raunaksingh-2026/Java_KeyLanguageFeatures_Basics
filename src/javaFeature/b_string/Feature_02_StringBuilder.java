package javaFeature.b_string;

public class Feature_02_StringBuilder {
    static void main(String[] args) {

        /***************** Creating StringBuilder ********************/
        StringBuilder nameByBuilder1 = new StringBuilder();
        nameByBuilder1.append("Mango ");// StringBuilder Method used to adding text to string
        nameByBuilder1.append("Banana ");

        /***************** Printing StringBuilder ********************/
        System.out.println(nameByBuilder1);

        /***************** Creating String by converting StringBuilder to String ********************/
        String nameByBuilder2 = nameByBuilder1.toString();
        System.out.println(nameByBuilder2);

        /***************** Modifying String and StringBuilder ********************/
        nameByBuilder1.append("Apple ");
        nameByBuilder2 = "Apple ";

        /***************** Reprinting String and StringBuilder ********************/
        System.out.println(nameByBuilder2);/// new String object is created
        System.out.println(nameByBuilder1);/// same String object is updated

        /***************** Some StringBuilder method ********************/
        nameByBuilder1.append(43);// we can add integer value
//        nameByBuilder1.insert()

        System.out.println(nameByBuilder1.insert(6, "आम "));
        System.out.println(nameByBuilder1.length());// to get length of String
        System.out.println(nameByBuilder1.indexOf("ple"));// to get index of argument
        System.out.println(nameByBuilder1.charAt(6));// Return character at given index
        System.out.println(nameByBuilder1.delete(5, 8));
//        System.out.println(nameByBuilder1.reverse());// we can reverse the given String
    }
}
