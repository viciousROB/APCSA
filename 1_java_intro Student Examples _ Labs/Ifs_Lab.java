import java.util.Scanner;

public class Ifs_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter an integer :: ");
        int num = kb.nextInt();
        
        //if the number is divisible by 2 then print out Even
        if( num % 2 == 0 )
        	 System.out.println( " Even " );
          
        //if the number has a remainder of 1 then print out Odd
        else if( num % 2 == 1 )
        	 System.out.println( " Odd " );
        

        //write an if statement to print out if the number is odd or even
        //you will need to use % mod to get the remainder of division
        //8 % 3 == 2
    }
}
