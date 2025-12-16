package week5;
import java.util.Scanner;
public class RestaurantSystem
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        int choice;
        int quantity;
        int total = 0;
        do 
        {
            System.out.println("Restaurant Menu");
            System.out.println("1: Burger Rs 200"+"\n2: Pizza Rs 550"+"\n3: Momo Rs 100"+"\n0: Exit");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1: 
                    System.out.println("You have chosen Burger"+"\nPlease enter quantity");
                    quantity=sc.nextInt();
                    total=total + (200 * quantity);
                    break;

                case 2: 
                    System.out.println("You have chosen Pizza"+"\nPlease enter quantity");
                    quantity=sc.nextInt();
                    total=total + (550 * quantity);
                    break;

                case 3: 
                    System.out.println("You have chosen Momo"+"\nPlease enter quantity");
                    quantity=sc.nextInt();
                    total=total + (100 * quantity);
                    break;
                
                case 0:
                    System.out.println("Your Final Total is: Rs " + total);
                    break;
                    
                default:
                    System.out.println("Please do a Valid Action");
            }
        } while (choice != 0); 
    }
}