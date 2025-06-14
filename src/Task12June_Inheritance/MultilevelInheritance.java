package Task12June_Inheritance;
// Description: Create class Grandparent → Parent → Child and demonstrate multilevel inheritance.
class Grandparent
{
void showGrandParent(){
    System.out.println("Grandparent");
}
}
class Parent extends Grandparent
{
void showparent(){
    System.out.println("Parent");
}
}
class Child extends Parent
{
void showchild(){
    System.out.println("Child");
}
}


public class MultilevelInheritance {
    public static void main(String[] args) {
    Child c=new Child();
    c.showchild();
    c.showparent();
    c.showGrandParent();
    }
}
