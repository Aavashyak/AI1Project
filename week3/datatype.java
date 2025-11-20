package week3;
public class datatype
{
    public static void main (String args[])
    {
        System.out.println("Maximum Size of Integer Data Type is "+Integer.MAX_VALUE);
        System.out.println("Minimum Size of Integer Data Type is "+Integer.MIN_VALUE);
        System.out.println("Integer Data Type is "+Integer.BYTES);
        System.out.println("Size of Integer Data Type is "+Integer.SIZE);
        System.out.println("Maximum Size of Float Data Type is "+Float.MAX_VALUE);
        System.out.println("Minimum Value of Float Data Type is "+Float.MIN_VALUE);
        System.out.println("Float Data Type is "+Float.BYTES);
        System.out.println("Size of Float Data Type is "+Float.SIZE);
        
        byte b = 13;
        byte c = 14;
        byte d = (byte)(b+c);
        
        float f=2.33f;
        long l=233;
        
        int a=10;
        float g=2.333f;
        double k=2.44;
        
        int x=(int)(a+g+k);
        System.out.println(x);
        
        int y=10;
        int u=4;
        float result=y/u;
        
        System.out.println(result);
        
        result =((float)y/u);
        
        System.out.println("My Name is");
        System.out.println("Aavashyak");
        
        System.out.println ("My \t name is: \n" +"\"Charlie Klank\"");
        
        int le=10;
        int br=20;
        int ar=(le*br);
        int pm=2*(le+br);
        
        System.out.println("The Area is "+ar);
        System.out.println("The Perimeter is "+pm);
        
        int pri=50000;
        int year= 5;
        float rate=2.3f;
        float si = ((pri*year*rate)/100);
        System.out.println ("Simple Interest is " +si);
    }
}