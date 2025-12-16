package week3;
import java.util.Scanner;
public class PassFail
{
    public static void main (String args [])
    {
        System.out.println("Enter Grade Percentage");
        Scanner in = new Scanner(System.in);
        float grade = in.nextFloat();
        String result = (grade>=40)?"Congratulations You have Passed":"Unfortunately You have Failed";
        System.out.println("Results: "+result);
    }
}