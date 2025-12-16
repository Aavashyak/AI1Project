package week1;
import java.util.Scanner;
public class Identity
{
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name ");
        String name = in.nextLine();
        System.out.println("My name is " + name) ;
    }
}