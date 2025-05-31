package ex_01_JavaBasics;

import java.util.Scanner;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class Task31May_RevString_forloop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();


        String reversed = "";


        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }


        System.out.println("Reversed string: " + reversed);


        scanner.close();
    }

}
