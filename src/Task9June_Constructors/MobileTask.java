package Task9June_Constructors;
//Create a class Mobile. Use constructor overloading. First constructor → takes only brand
//Second constructor → takes brand and price
public class MobileTask {
    String brand;
    double price;

    MobileTask(String brand){
this.brand=brand;
this.price=0.00;
    }
MobileTask(String brand, double price){
    this.brand=brand;
    this.price=price;

}
void display()
{
    System.out.println("Mobile Brand: " + brand);
    System.out.println("Mobile Price: ₹" + price);
}
    public static void main(String[] args) {
        MobileTask m1=new MobileTask("Samsung");
        m1.display();
        MobileTask m2=new MobileTask("Apple",90000.00);
        m2.display();

    }
}
