package week6;
import java.util.Scanner;
public class matrixexample
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[2][2]; 

        System.out.println("Enter Data for the Matrix:");
        
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nDisplaying the data of the given matrix:");
        for (int x=0; x<matrix.length; x++)
        {
            for (int y=0; y<matrix[x].length; y++)
            {
                System.out.print(matrix[x][y] + "\t"); 
            }
            System.out.println(); 
        }
    }
}