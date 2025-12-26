package week7;
import java.util.Scanner;
public class Rectangle
{
    float length;
    float width;
    float area;
    void start()
    {
        System.out.println("Given that Length and Breadth are");
    }
    void stop()
    {
        System.out.println("Calcuation Done");
    }
    public static void main (String args[])
    {
        Rectangle r=new Rectangle();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length");
        r.length = in.nextFloat();
        System.out.println("Enter Width");
        r.width = in.nextFloat();
        r.area = (r.length*r.width);
        r.start();
        System.out.println(r.length+" cm"+"\n"+r.width+" cm"+"\n"+"The Area of Rectangle is " +"\n" + r.area + " squared cm");
        r.stop();
        
        Rectangle r1=new Rectangle();
        System.out.println("Enter Length");
        r1.length = in.nextFloat();
        System.out.println("Enter Width");
        r1.width = in.nextFloat();
        r1.area = (r1.length*r1.width);
        r1.start();
        System.out.println(r1.length+" cm"+"\n"+r1.width+" cm"+"\n"+"The Area of Rectangle is " +"\n" + r1.area + " squared cm");
        r1.stop();
    }
}