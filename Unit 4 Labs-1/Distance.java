//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Cedric McEnroe
//Date -  10/10/19
//Class - 4th Period
//Lab  - Distance

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int x1,y1,x2,y2;
   private double dist;
	public Distance()
	{


	}

	public void Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
   x1 = xOne;
   x2 = xTwo;
   y1 = yOne;
   y2 = yTwo;
   dist = Math.pow(Math.pow(((double)x2-(double)x1),2)+Math.pow(((double)y2-(double)y1),2),0.5);
   System.out.println(dist);
	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
   x1 = xOne;
   x2 = xTwo;
   y1 = yOne;
   y2 = yTwo;
   
	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
		String result="";






		return result;
	}
	
	public String toString()
	{
		return "";
	}
}