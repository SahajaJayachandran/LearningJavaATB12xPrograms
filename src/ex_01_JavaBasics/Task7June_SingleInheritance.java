package ex_01_JavaBasics;


    class Vehicle{
        void start(){
            System.out.println("Stating vehicle");
        }
    }
    class Car extends Vehicle {
        void drive(){
            System.out.println("Driving the car");
        }


    }
class Bike extends Vehicle {
    void accelerate(){
        System.out.println("Riding the Bike");
    }
}
    public class Task7June_SingleInheritance {
        public static void main(String[] args) {
            Car myCar = new Car();
            Bike myBike=new Bike();
            myCar.start();
            myCar.drive();
            myBike.accelerate();
        }

    }

