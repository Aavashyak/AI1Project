package week2; 
import java.util.Scanner;
public class waterlevelmonitor
{
    public static void main (String args []) 
    {
        System.out.println ("Enter Water Level");
        Scanner in = new Scanner(System.in);
        double wlevel = in.nextDouble();
        String message = (wlevel>=1000)?"WARNING Water level high":"Normal water level";
        System.out.println("Status: " +message);
    }
}
