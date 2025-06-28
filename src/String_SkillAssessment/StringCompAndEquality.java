package String_SkillAssessment;
//Create a program that demonstrates different ways to compare strings in Java, including == operator, equals(), equalsIgnoreCase(), and compareTo() methods.
//input: String1: "Hello", String2: "hello", String3: "Hello"
//output: equals(): false, equalsIgnoreCase(): true, compareTo(): -32
public class StringCompAndEquality {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";


        boolean isEqual = string1.equals(string2);
        System.out.println("equals(): " + isEqual);


        boolean isEqualIgnoreCase = string1.equalsIgnoreCase(string2);
        System.out.println("equalsIgnoreCase(): " + isEqualIgnoreCase);


        int compareResult = string1.compareTo(string2);
        System.out.println("compareTo(): " + compareResult);
    }
}
