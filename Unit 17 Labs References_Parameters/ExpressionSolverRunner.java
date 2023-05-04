//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric McEnroe 

import static java.lang.System.*;

public class ExpressionSolverRunner
{
	public static void main( String args[] )
	{
		ExpressionSolver test = new ExpressionSolver("2 + 4 / 2 - 3 * 4 - 6 / 6");
		test.solveExpression();
		out.println(test);

		test.setExpression("3 * 5");
		test.solveExpression();
		out.println(test);

		test.setExpression("2 + 4 / 2 - 3 * 4 - 6 / 6");
		test.solveExpression();
		out.println(test);

		test.setExpression("3 / 5");
		test.solveExpression();
	   out.println(test);

	   test.setExpression("5 / 5 * 2 + 8 / 2 + 5");
		test.solveExpression();
		out.println(test);

	   test.setExpression("5 * 5 + 2 / 2 - 8 + 5 * 5 - 2");
		test.solveExpression();
		out.println(test);
	}
}