//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/1/19
//Class - 4th Period
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
   xOne = x1;
   xTwo = x2;
   yOne = y1;
   yTwo = y2;
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
	}

	public void calcDistance()
	{
   distance = Math.sqrt(Math.pow(((double)xTwo-(double)xOne),2)+Math.pow(((double)yTwo-(double)yOne),2));
	}
	
	public double getDistance()
	{
		return 0.0;
	}
	
	public void print()
	{
   System.out.print("distance == ");
   System.out.printf("%.3f",distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "";
	}
}