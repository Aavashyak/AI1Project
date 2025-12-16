package week4;
import java.util.Scanner;
public class GPAGradeConvert
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your GPA");
        double gpa = sc.nextDouble();
        if ((gpa<=4.0) && (gpa>=3.7))
        {
            System.out.println(gpa+" Means that your Grade is A");
        }
        else if ((gpa <=3.3) && (gpa>=2.7))
        {
            System.out.println(gpa+" Means that your Grade is B");
        }
        else if ((gpa <=3.3) && (gpa>=2.7))
        {
            System.out.println(gpa+" Means that your Grade is C");
        }
        else if ((gpa <=2.3) && (gpa>=1.7))
        {
            System.out.println(gpa+" Means that your Grade is D");
        }
        else if ((gpa <=1.3) && (gpa>=1.0))
        {
            System.out.println(gpa+" Means that your Grade is E");
        }
        else
        {
            System.out.println("Enter Correct GPA Range");
        }
    }
}