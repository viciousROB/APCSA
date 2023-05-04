import java.util.Scanner;

public class NestedLoops_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter the width of the box: ");
        int width = kb.nextInt();

        System.out.print( "Enter the height of the box: ");
        int height = kb.nextInt();
        
        for( int h = 0; h < height; h++)
        {
         for( int w = 0; w < width; w++)
         {
          System.out.print("#");
         }
         System.out.println();
        }
        
        //write nested loops that will print out a box of asterisks
        // based on the width and height
        
    }
}
