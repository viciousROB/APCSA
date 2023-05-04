//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/9/19
//Lab  - Leap Year

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYearRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
      System.out.print("Enter a year ::  ");
      int year = keyboard.nextInt();
	   LeapYear test = new LeapYear();
      test.isLeapYear(year);
					
	}
}