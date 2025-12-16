package week3;
import java.util.Scanner;
public class MathOperations
{
    public static void main (String args[])
    {
        System.out.println("Enter First Number");
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        System.out.println("Enter Second Number");
        float num2 = in.nextFloat();
        float sum = num1+num2;
        float sub = num1-num2;
        float prod = num1*num2;
        float div = num1/num2;
        float mod = num1%num2;
        System.out.println("The Sum, Sub, Prod, Divison, Remainder Respectively are: \n" + sum+"\n"+ sub+"\n"+ prod+"\n" + mod);
    }
}