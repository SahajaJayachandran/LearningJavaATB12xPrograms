package Task12June_Inheritance;
class Animal1 {
    // Method of parent class
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class inheriting Animal
class labrador extends Animal {
    // Overriding the sound() method
    void sound() {
        // Call parent class method using super
        super.sound();
        System.out.println("Dog barks");
    }
}

// Main class
public class SuperKeyword {
    public static void main(String[] args) {
        labrador myDog = new labrador();
        myDog.sound();  // Calls Dog's sound(), which also calls Animal's sound()
    }
}

