//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/17/19

import static java.lang.System.*; 
import java.util.Scanner;

public class StringUtilities
{
 	public static boolean endsWith(String a, String b)
 	{
      if(a.indexOf(b)!=-1)
         {
         if(a.substring(a.length()-1,a.length()) == b.substring(b.length()-1,b.length()))
		   return true;
         }
      else
      {
         return false;
        }
        return false;
	}
}