package Task9June_Constructors;
//Write a Book class that takes title, author, and price via constructor. Display all values.
public class BookTask {
    String title;
    String author;
    double price;
    BookTask(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void bookdetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }


    public static void main(String[] args) {
    BookTask bt=new BookTask("The Monk who sold his Ferrari","Robin Sharma", 250.00);
    bt.bookdetails();
    }
}
