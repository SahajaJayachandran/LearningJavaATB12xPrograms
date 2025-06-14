package Task9June_Constructors;

import java.util.Scanner;
//Define a Car class with brand, model, and price. Initialize using constructor and print car details.
public class Car_Task {
    String carName;
    String Colour;
    int Year;

    Car_Task(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Car name: ");
        carName=sc.nextLine();
        System.out.print("Enter colour of the Car: ");
        Colour=sc.nextLine();
        System.out.print("Enter year of Manufacture: ");
        Year=sc.nextInt();
    }
void print(){
    System.out.println("Car Name is: "+carName);
    System.out.println("Colour of the Car is: "+Colour);
    System.out.println("Year of Manufacture is: "+Year);
}
    public static void main(String[] args) {
Car_Task ct=new Car_Task();
ct.print();
    }
}
