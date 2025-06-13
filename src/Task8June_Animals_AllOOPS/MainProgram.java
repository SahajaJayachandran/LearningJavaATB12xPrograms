package Task8June_Animals_AllOOPS;

public class MainProgram {
    public static void main(String[] args) {
    Dog dog1 = new Dog("Bruno");

    System.out.println("Dog's name: " + dog1.getName());
    dog1.sound();
    dog1.play();
    dog1.play("ball");

    dog1.setName("Rocky");
    System.out.println("Updated Dog's name: " + dog1.getName());
    dog1.sound();
}
}
