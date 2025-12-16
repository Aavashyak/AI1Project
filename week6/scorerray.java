package week6;
public class scorerray
{
    public static void main(String args[])
    {
        int sum=0;
        int avg=0;
        int[]result={10,20,30,40,50};
        for(int index=0;index<result.length;index++)
        {
        System.out.println(result[index]);
        sum=sum+result[index];
        avg=sum/result.length;
        }
        System.out.println("The Sum of Array is: "+ sum+"\n"+"The Average of Array is: "+avg);
    }
}