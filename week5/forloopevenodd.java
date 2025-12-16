package week5;
public class forloopevenodd
{
    public static void main (String args [])
    {
        int sum=0;
        int sumo=0;
        for (int i=1;i<=10;i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
                sum=sum+i;
            }
            else
            {
                System.out.println(i);
                sumo=sumo+i;
            }
        }
        System.out.println("Sum of Odd numbers are: " +sumo+ "\n" +"Sum of even numbers are:"+ sum);
    }
}
