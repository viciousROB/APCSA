import java.util.Scanner;
import java.util. Arrays;

public class Arrays_Lab
{
    public static void main(String[] args) 
    {
        int[] rayOne = {2,3,4,5,6,7,8,9,0,11,2,3,4,5,3};
        int x = 0;
        //write a loop to print out every other number in the array
        System.out.println("Every Other Number in Array");
        while (x <= rayOne.length - 1)
        {
        System.out.println(rayOne[x]);
        x = x + 2;
        }
        
        //write a loop to print out all of the numbers backwards
        System.out.println();
        System.out.println("Array Printed Backwards");
        int b = rayOne.length - 1;
        while (b >= 0)
        {
        System.out.println(rayOne[b]);
        b = b - 1;
        }
        
        
    }
}
