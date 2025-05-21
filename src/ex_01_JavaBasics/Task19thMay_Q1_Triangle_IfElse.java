package ex_01_JavaBasics;

import java.util.Scanner;

public class Task19thMay_Q1_Triangle_IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the sides of the triangle
        System.out.print("Enter side n1: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter side n2: ");
        int n2 = scanner.nextInt();

        System.out.print("Enter side n3: ");
        int n3 = scanner.nextInt();



        if (n1 == n2 && n2 == n3) {
            System.out.println("The triangle is Equilateral");
        } else  if (n1 == n2 || n2 == n3 || n1 == n3) {
            System.out.println("The triangle is Isosceles");
        } else {
            System.out.println("The triangle is Scalene");
        }


        scanner.close();

    }
}

