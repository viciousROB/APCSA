//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/1/19
//Class - 4th Period
//Lab  - Quadratic

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;


	public Quadratic(int quadA, int quadB, int quadC)
	{
   a = quadA;
   b = quadB;
   c = quadC;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
   quadA = a;
   quadB = b;
   quadC = c;
 	}

	public void calcRoots( )
	{
   rootOne = (((double)b-2*(double)b)+Math.sqrt(Math.pow((double)b,2)-4*(double)a*(double)c))/((double)a*2);
   rootTwo = (((double)b-2*(double)b)-Math.sqrt(Math.pow((double)b,2)-4*(double)a*(double)c))/((double)a*2);
	}

    public void print()
    {
    System.out.println();
    System.out.println();
    System.out.print("rootone :: ");
    System.out.printf("%.2f",rootOne);
    System.out.println();
    System.out.print("roottwo :: ");
    System.out.printf("%.2f",rootTwo);
    }
    
    //complete either print or the toString()

	public String toString()
	{
		return "";
	}
}