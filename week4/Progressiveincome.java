package week4;
import java.util.Scanner;
public class Progressiveincome
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter income");
        double income = sc.nextDouble();
        double tax;
        if (income<500000)
        {
            tax = (income - income*0.01);
            System.out.println(income+" Tax is 1% of income" + "\nIncome after tax is " +tax);
        }
        else if ((income <=500001) && (income>=700000))
        {
            tax = (income - income*0.1);
            System.out.println(income+" Tax is 10% of income" + "\nIncome after tax is " +tax);
        }
        
        else if ((income <=700001) && (income>=1000000))
        {
            tax = (income - income*0.2);
            System.out.println(income+" Tax is 20% of income" + "\nIncome after tax is " +tax);
        }
        else if ((income <=1000001) && (income>=2000000))
        {
            tax = (income - income*0.3);
            System.out.println(income+" Tax is 30% of income" + "\nIncome after tax is " +tax);
        }
        else if ((income <=2000001) && (income>=5000000))
        {
            tax = (income - income*0.36);
            System.out.println(income+" Tax is 36% of income" + "\nIncome after tax is " +tax);
        }
        else if (income>5000000)
        {
            tax = (income - income*0.39);
            System.out.println(income+" Tax is 39% of income"+ "\nIncome after tax is " +tax);
        }
        else
        {
            System.out.println("Enter income in Numbers");
        }
    }
}