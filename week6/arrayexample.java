package week6;
public class arrayexample
{
    public static void main (String args[])
    {
        int[] age; //array declaration
        age=new int[5]; //array construction

        age[0]=10;  
        age[1]=20;
        age[2]=30;
        age[3]=22;
        age[4]=33;

        System.out.println(age[0]); //display array data
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
        
        int[]numbers = new int[5];
        System.out.println("initialization using for loop");
        int x=2;
        for (int index=0;index<numbers.length;index++)
        {
            numbers[index]=x;
            x=x+2;
        }
        System.out.println("displaying using for loop");
        
        for (int y=0;y<numbers.length;y++)
        {
            System.out.println(numbers[y]);
        }
    }
}