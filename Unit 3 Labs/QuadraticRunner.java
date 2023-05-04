//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/1/19
//Class - 4th Period
//Lab  - Quadratic

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class QuadraticRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter a :: ");
		int quadA = keyboard.nextInt();

		out.print("Enter b :: ");
		int quadB = keyboard.nextInt();

		out.print("Enter c :: ");
		int quadC = keyboard.nextInt();

		Quadratic test = new Quadratic(quadA, quadB, quadC);
      test.calcRoots();
		test.print();

	
	}
}