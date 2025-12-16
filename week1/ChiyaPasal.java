package week1;
import java.util.Scanner;
public class ChiyaPasal 
{
    public static void main (String args[]) 
    {
        System.out.println("Weclome to Chiya Pasal");
        System.out.println ("What would you like to have?");
        System.out.println ("Samosa, Tea");
        Scanner in = new Scanner(System.in);
        String order = in.nextLine();
        if ((order.equalsIgnoreCase("Samosa")) || (order.equalsIgnoreCase("Tea")))
        {
            System.out.println(order+" Coming Up");
        }
        else
        {
            System.out.println("That's not in our Menu");
        }
    }
}