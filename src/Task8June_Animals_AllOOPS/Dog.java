package Task8June_Animals_AllOOPS;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(getName() + " barks");
    }

    public void play() {
        System.out.println(getName() + " is playing");
    }

    public void play(String toy) {
        System.out.println(getName() + " is playing with " + toy);
    }
}