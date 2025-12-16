package week2;
import java.util.Scanner;
public class studentinfo 
{
    public static void main (String args []) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name");
        String name = in.nextLine();
        System.out.println ("Enter Age");
        int Age = in.nextInt();
        System.out.println ("Enter GPA");
        float gpa = in.nextFloat();
        System.out.println ("Name: "+name);
        System.out.println ("Age: "+Age);
        System.out.println ("Grade Point Average "+gpa);
    }
}