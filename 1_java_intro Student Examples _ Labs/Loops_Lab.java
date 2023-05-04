import java.util.Scanner;

public class Loops_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter a starting number :: ");
        int numOne = kb.nextInt();
        
        System.out.print( "Enter an ending number :: ");
        int numTwo = kb.nextInt();
        
        //check if numOne is greater then or equal to numTwo
        while (numOne <= numTwo)
        {
        //while this is true, print the current value of numOne
         System.out.println(numOne);
        //after this add 1 to the value of numOne in order to ensure that the original number is printed
         numOne = numOne + 1;
        }
        if (numOne > numTwo)
        {
        System.out.println("Starting number is greater then ending number");
        }
        //write a loop that will print out all of the numbers
		//from numOne to numTwo inclusive of both
		
    }
}
