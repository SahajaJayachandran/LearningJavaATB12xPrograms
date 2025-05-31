package ex_01_JavaBasics;

import java.util.Scanner;

public class Task31May_RevString_StringBuffer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input");
        String input=scanner.nextLine();
       StringBuilder s= new StringBuilder(input);

        System.out.println("Reversed string is "+s.reverse());
        scanner.close();
        }

    }

