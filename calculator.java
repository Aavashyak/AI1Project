import java.util.Scanner;
public class calculator 
{
    public static void main (String args[]) 
    {
        System.out.println("Welcome to the Calculator");
        System.out.println ("Enter First Number");
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        System.out.println ("Enter Second Number");
        float num2 = in.nextFloat();
        float sum = num1+num2;
        float sub = num1-num2;
        float prod = num1*num2;
        float div = num1/num2;
        float mod = num1%num2;
        System.out.println("The sum is "+ sum);
        System.out.println("The difference is "+ sub);
        System.out.println("The product is "+ prod);
        System.out.println("The division is "+ div);
        System.out.println("The remainder is "+ mod);
    }
}