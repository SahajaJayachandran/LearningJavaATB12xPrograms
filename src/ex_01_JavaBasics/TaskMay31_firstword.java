package ex_01_JavaBasics;
import java.util.Scanner;
public class TaskMay31_firstword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        System.out.print(input.charAt(0));
    }
}
