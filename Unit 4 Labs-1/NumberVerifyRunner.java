//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date -  10/10/19
//Class - 4th Period
//Lab  - OddEvenNumber

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
      Scanner keyboard = new Scanner(System.in);
      NumberVerify test = new NumberVerify();
      System.out.print("Enter a whole number ::  ");
      int num = keyboard.nextInt();
      test.isOdd(num);
      test.isEven(num);

      
 /*     
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
	*/	
		//add in more test cases
	}
}