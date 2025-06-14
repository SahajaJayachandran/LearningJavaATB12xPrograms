package Task12June_Inheritance;



// Description: Create a class Animal with a method sound(). Inherit it in Dog class and override the method.



class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class SingleInheritance_Animal {

    public static void main(String[] args) {
        Animal a=new Animal();
        a.sound();
        Dog dog=new Dog();
        dog.sound();

    }
}
