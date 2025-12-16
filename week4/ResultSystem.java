package week4;
import java.util.Scanner;
public class ResultSystem
{
    public static void main(String args[])
    {
        Scanner result = new Scanner(System.in);
        System.out.println("Enter Grade Percentage");
        int percentage=result.nextInt();
        if ((percentage<=100) && (percentage>=95))
        {
            System.out.println(percentage + " is Distinction");
        }
        else if ((percentage<=94) && (percentage>=80))
        {
            System.out.println(percentage + " is First Division");
        }
        else if ((percentage<=79) && (percentage>=70))
        {
            System.out.println(percentage + " is Second Division");
        }
        else if ((percentage<=69) && (percentage>=50))
        {
            System.out.println(percentage + " is Third Division");
        }
        else
        {
            System.out.println(percentage + " is Fail");
        }
    }
}