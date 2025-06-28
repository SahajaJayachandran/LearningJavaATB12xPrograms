package String_SkillAssessment;

//Write a Java program that demonstrates basic string operations including concatenation, length, substring, and character extraction.
//input: Hello World Output: Length: 11, First char: H, Substring: World

public class BasicStringOperations {
    public static void main(String[] args) {
        String input = "Hello World";


        int length = input.length();


        char firstChar = input.charAt(0);


        String sub = input.substring(6);


        System.out.println("Length: " + length + ", First char: " + firstChar + ", Substring: " + sub);
    }
}
