import java.util.Scanner;
import java.util. Arrays;

public class Matrices_Lab
{
		
   public static void main(String[] args) 
   {
       int[][] mat = {{2,3,4},{55,66,77},{22,11}};
       
       System.out.println( sumMat( mat ) );       
   }
   
   //Write the method sumMat which receives a 2D integer array 
   //Use for-each loops to sum all integers in the array & return the sum   
   public static int sumMat( int[][] matty )
	{
   int sum = 0;
        for( int[] row : matty )
        {
        	  for( int item : row )
        	  {
        	  	  sum = item + sum;
        	  }
        }
      return sum;
	}

}
