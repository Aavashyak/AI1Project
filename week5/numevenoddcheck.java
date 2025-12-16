package week5;
import java.util.Scanner;
public class numevenoddcheck
{
    public static void main (String args[])
    {
        //float odd = 0;
        //float even = 0;
        int rem=0, rnum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number for Checking");
        int num=sc.nextInt();
        while (num!=0)
        {
            /*int digit = num%10;
            if (digit%2==0)
            {
                even++;
            }
            else odd++;
            System.out.println(num)*/
            rem=num%10;
            rnum=rnum*10+rem;
            num=num/10;
        }
        System.out.println("rev is: "+rnum);
    }
}