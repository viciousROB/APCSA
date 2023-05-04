//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric MCEnroe

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static void printTriangle(String word)
	{
   int l=word.length();
   for(int x=0;x<=l;x++)
   {
   for(int e=0;e<x;e++)
   {
   out.print(word.substring(0,x));
   }
   out.println();
   }
	}
}