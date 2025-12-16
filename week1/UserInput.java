package week1;
import java.util.Scanner;
public class UserInput
{
    public static void main (String args [])
    {
        Scanner ava = new Scanner (System.in);
        System.out.println ("Enter the First Number");
        float firstnum = ava.nextFloat();
        System.out.println ("Enter the Second Number");
        float secondnum = ava.nextFloat();
        float ans = (firstnum+secondnum);
        float bigger = (firstnum>secondnum)?firstnum:secondnum;
        System.out.println("The Bigger Number is "+bigger);
        System.out.println("Sum of both numbers is "+ans);
    }
}