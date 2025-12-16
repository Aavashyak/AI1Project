package week4;
import java.util.Scanner;
public class DivisiblebyBoth3And5
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num1=sc.nextInt();
        if (num1%3==0)
        {
            if (num1%5==0)
                System.out.println(num1+ " is both divisible by 3 and 5");
            else
            {
                System.out.println(num1+ " is divisble by 3 not 5");
            }
        }
        else
        {
            if(num1%5==0)
            {
                System.out.println(num1 + " is divisible by 5 not 3");

            }
            else
            {
                System.out.println(num1+ " is not divisible by neither 3 nor 5");
            }
        }
    }
}