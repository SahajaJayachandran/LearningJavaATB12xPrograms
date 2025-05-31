package ex_01_JavaBasics;

import java.util.Scanner;

public class Task31May_Countwords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.trim().replaceAll("\\s+", " ");

        if (input.isEmpty()) {
            System.out.println("Number of words: 0");
        } else {

            String[] words = input.split(" ");
            int wordCount = words.length;
            System.out.println("Total words in the sentence = " + wordCount);
        }
        scanner.close();
    }
}
