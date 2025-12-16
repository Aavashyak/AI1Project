package week4;
import java.util.Scanner;
public class EventOddExample
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int number=sc.nextInt();
        if (number%2==0)
        {
            System.out.println(number+ " is an Even Number");
        }
        else
        {
            System.out.println(number+ " is an Odd Number");
        }
        System.out.println("Operation Success!");
    }
}