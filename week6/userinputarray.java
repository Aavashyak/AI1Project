package week6;
import java.util.Scanner;
public class userinputarray 
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        sc.nextLine();
        String names [];names = new String[size];
        for (int index=0;index<names.length;index++)
        {
            System.out.println("Enter the student name");
            names[index]=sc.nextLine();
        }
        System.out.println("Displaying the names of Students");
        for (int z=0;z<names.length;z++)
        {
            System.out.println("Name of Student is "+names[z]);
        }
    }
}