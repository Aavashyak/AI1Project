package week4;
import java.util.Scanner;
public class Discounts
{
    public static void main (String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Price");
        double mp = sc.nextDouble();
        System.out.println("Enter Category"+"\n A,B,C or D");
        sc.nextLine();
        String cat = sc.nextLine();
        double sp;
        if (cat.equalsIgnoreCase ("A"))
        {
            sp=mp-(mp*0.6);
            System.out.println("Category A Items get 60% Discount"+"\n Your Total Price is "+ sp);
        }
        else if (cat.equalsIgnoreCase("B"))
        {
            sp=mp-(mp*0.4);
            System.out.println("Category B Items have 40% Discount"+"\n Your Total Price is "+ sp);
        }
        else if (cat.equalsIgnoreCase("C"))
        {
            sp=mp-(mp*0.2);
            System.out.println("Category C Items have 20% Discount"+"\n Your Total Price is "+ sp);
        }
        else if (cat.equalsIgnoreCase("D"))
        {
            sp=mp-(mp*0.1);
            System.out.println("Category D Items have 10% Discount"+"n Your Total Price is "+ sp);
        }
        else
        {
            System.out.println("Enter Correct Category");
        }
    }
}