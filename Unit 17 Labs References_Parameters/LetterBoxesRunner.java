//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric McEnroe

import java.util.Scanner;
import static java.lang.System.*;

public class LetterBoxesRunner
{
	public static void main( String args[] )
	{		
   	Scanner keyboard = new Scanner(System.in);
      			LetterBoxes printBox = new LetterBoxes();
   	String choice="";
		do{
			out.print("\nEnter the letter for the box :: ");
			String wor = keyboard.next();
	      char word = wor.charAt(0);
			out.print("Enter the size of the box :: ");
 			int times = keyboard.nextInt();			
         LetterBoxes.printBox(word,times);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));		

	}
}