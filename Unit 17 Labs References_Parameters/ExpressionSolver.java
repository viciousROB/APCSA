//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric MCEnroe

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
	//add in instance variables
   private String expression;
   private String expression2;
   private int space1;
   private int space2;
   private String first;
   private String second;
   private int F1;
   private int S2;
   private int answer;
   
	public ExpressionSolver(String s)
	{
      expression = "";
      space1 = 0;
      space2 = 0;
      first = "";
      second = "";
	}

   public void setExpression(String s)
   {
      expression = s;
      expression2 = s;
      int i2 = 1;
      for (int i = expression.length()-2; i>3;)
      {
      i = i-4;
      i2++;
      }
      int k = 0;
      first = expression.substring(0,1);
      answer = Integer.parseInt(first);
      while ( i2 > 0)
      {
      second = expression.substring(4+4*k,5+4*k);
      S2 = Integer.parseInt(second);
      if (expression.charAt(2+4*k) == '+')
      answer = (answer + S2);
      else if (expression.charAt(2+4*k) == '-')
      answer = (answer - S2);
      else if (expression.charAt(2+4*k) == '*')
      answer = (answer * S2);
      else if (expression.charAt(2+4*k) == '/')
      answer = (answer / S2);
      k++;
      i2--;
      }
      
   }
   
	public void solveExpression()
	{
   
	}

	public String toString( )
	{
		return expression2+ " = "+answer;
	}
}