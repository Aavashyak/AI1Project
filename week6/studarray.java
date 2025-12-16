package week6;
import java.util.Scanner;
public class studarray
{
    public static void main (String args[])
    {
        String[] name={"Saroj", "Sushant","Ujjwal", "Rabina", "Sandesh"};
        System.out.println("Name on Second Index is "+name[2]);
        System.out.println("Names on the Array are:");
        for(int index=0;index<name.length;index++)
        {
            System.out.println(name[index]);
        }
    }
}