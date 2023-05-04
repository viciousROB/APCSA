//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric McEnroe

import static java.lang.System.*; 
import java.util.Scanner;

public class BigOrSmall
{
	public static String check( int a, int b )
	{
   if(a>b)
   {
   return "yes";
   }
   else if(b>a)
   {
   return "no";
   }
   else
   {
   return "aplus";
   }
	}
}