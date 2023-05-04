//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/9/19
//Lab  - Leap Year

import static java.lang.System.*; 
import java.util.Scanner;

public class LeapYear
{
	public static void isLeapYear( int year )
	{
   if(year%4 == 0)
   {
   System.out.println(year+" is a leap year.");
   }
   else
   {
   System.out.println(year+" is NOT a leap year.");
   }

	}
}