//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/17/19

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;
   private String ra;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
   if(s.length()%2==0)
   {
   ra = s+" is even.";
   System.out.println(ra);
   }
   else
   {
   ra = s+" is odd.";
   System.out.println(ra);
   }
	}

	public void setString(String s)
	{
	}

 	public boolean isEven()
 	{
		return false;
	}

 	public String toString()
 	{
 		String output="";
 		return output;
	}
}