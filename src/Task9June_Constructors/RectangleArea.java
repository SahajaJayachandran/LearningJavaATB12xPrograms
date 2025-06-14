package Task9June_Constructors;

import java.util.Scanner;
//Create a Rectangle class. Pass length and breadth via constructor, calculate and print area.
public class RectangleArea {
    int l;
    int b;
    RectangleArea(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Length of the rectangle: ");
        l=sc.nextInt();
        System.out.print("Enter Breadth of the rectangle: ");
        b=sc.nextInt();

    }
    void printArea(){
        System.out.println("Area of the reactangle is: "+(l*b));
    }

    public static void main(String[] args) {
        RectangleArea ra=new RectangleArea();
        ra.printArea();
    }
}
