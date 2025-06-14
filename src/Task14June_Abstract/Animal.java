package Task14June_Abstract;
//Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.
abstract class Animal1 {
    abstract void makeSound();
}

class Dog extends Animal1{

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal1{

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}
public class Animal{
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        d.makeSound();
        c.makeSound();
    }
}
