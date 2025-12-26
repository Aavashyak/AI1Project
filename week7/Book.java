package week7;
import java.util.Scanner;
public class Book
{
    String title;
    String author;
    double price;
    void start()
    {
        System.out.println("Book Details");
    }
    void stop()
    {
        System.out.println("End of Info");
    }
    public static void main (String args[])
    {
        Book b=new Book();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Book Title");
        b.title = in.nextLine();
        System.out.println("Enter Book Author");
        b.author = in.nextLine();
        System.out.println("Enter Book Price");
        b.price = in.nextDouble();
        b.start();
        System.out.println(b.author+"\n"+b.title+"\n"+b.price);
        b.stop();
    }
}