package Task12June_Inheritance;
// Description: Create a base class Vehicle. Derive classes Car and Bike from it.
class Vehicle{
    void start(){
        System.out.println("Start the vehicle");
    }
    void stop(){
        System.out.println("Stop the Vehicle");
    }
}
class Car extends Vehicle {
    void Car() {
        System.out.println("Its a Car");
    }
}
    class Bike extends Vehicle{
        void Bike(){
            System.out.println("Its a Bike");
        }
    }



public class HierarchialInheritance {
    public static void main(String[] args) {
        Car c=new Car();
        Bike b=new Bike();
        c.start();
        b.stop();
        b.Bike();
        c.Car();
    }
}
