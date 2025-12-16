package week4;
import java.util.Scanner;
public class switchcalc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int fnum=sc.nextInt();
        System.out.println("Enter the Second Number");
        int snum=sc.nextInt();
        System.out.println("Enter the Operator");
        char operator = sc.next().charAt(0);
        switch (operator)
        {
            case '+':System.out.println("Adding "+(fnum+snum));
                break;
            case '-':System.out.println("Subtracting "+(fnum-snum));
                break;
            case '*':System.out.println("Multiplying "+(fnum*snum));
                break;
            case '/':System.out.println("Dividing "+(fnum/snum));
                break;
            case '%':System.out.println("Modulus "+(fnum%snum));
                break;
        }
    }
}