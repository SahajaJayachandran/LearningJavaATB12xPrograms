package Task9June_Constructors;

import java.util.Scanner;
//Create a class Student with a constructor to initialize name and age. Print both using a display method.
public class Student_task {
    String name;
    int age;
    Student_task(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        name=sc.nextLine();
        System.out.println("Enter age");
        age=sc.nextInt();

    }
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Student_task s1=new Student_task();
        s1.display();
    }
}
