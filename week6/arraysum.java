package week6;
import java.util.Scanner;
public class arraysum
{
    public static void main (String args[])
    {
        int[]arr={10,40,50,22,45};
        int sum=0;
        for (int i =0; i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum is "+ sum);
    }
}