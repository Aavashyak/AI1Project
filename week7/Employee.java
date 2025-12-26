package week7;
import java.util.Scanner;
public class Employee
{
    void start()
    {
        System.out.println("Employee List");
    }
    void stop()
    {
        System.out.println("End of Employee List");
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        sc.nextLine();
        String names [];names = new String[size];
    }
}