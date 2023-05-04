//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date -  10/10/19
//Class - 4th Period
//Lab  - OddEvenNumber

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
      if(num%2==1)
      {
      System.out.println(num+" is odd :: true");
		return true;
      }
      else
      {
      System.out.println(num+" is odd :: false");
		return false;
      }
      
	}
	public static boolean isEven( int num )
	{
      if(num%2==0)
      {
      System.out.println(num+" is even ::true ");
		return true;
      }
      else
      {
      
      System.out.println(num+" is even :: false");
		return false;
      }
	}	
}