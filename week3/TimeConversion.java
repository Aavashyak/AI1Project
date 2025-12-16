package week3;
import java.util.Scanner;
public class TimeConversion
{
    public static void main (String args [])
    {
        System.out.println("Enter Time in Seconds");
        Scanner in = new Scanner(System.in);
        long time = in.nextLong();
        long min = time/60;
        long hour = time/3600;
        System.out.println("Time Conversion is: \n" + min + " Minutes"+ "\n" + hour+ " Hours");
    }
}