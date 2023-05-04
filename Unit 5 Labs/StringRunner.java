//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/17/19

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
   String s;
   Scanner keyboard = new Scanner(System.in);
   out.print("Enter a word :: ");
   s = keyboard.nextLine();
   StringOddOrEven test = new StringOddOrEven(s);

	}
}