package week4;
import java.util.Scanner;
public class numbercharge
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("This is the Number Detection Porgram"+"\n Enter Number");
        float num = sc.nextFloat();
        if (num>0)
        {
            System.out.println(num+" is a Positive Number");
        }
        else if (num<0)
        {
            System.out.println(num+" is a Negative Number");
        }
        else
        {
            System.out.println("0 is Neither Positive nor Negative");
        }
    }
}