package week2;
import java.util.Scanner;
public class pharmacy 
{
    public static void main (String args []) 
    {
        System.out.println ("Welcome to the Pharmacy Inventory");
        System.out.println ("Enter Medicine Name");
        Scanner in = new Scanner (System.in);
        String med1 = in.nextLine();
        System.out.println ("Enter Quantity");
        int num1 = in.nextInt();
        System.out.println ("Enter Price/Tablet");
        float pr1 = in.nextFloat();
        System.out.println ("Name: "+med1);
        System.out.println ("Amount: "+num1);
        System.out.println ("Price/Tablet: "+pr1);
    }
    
}