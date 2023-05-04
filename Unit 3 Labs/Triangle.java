//(c) A+ Computer Science
// www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/1/19
//Class - 4th Period
//Lab  - oop Return Triangle

import java.util.Scanner; 
import java.lang.Math.*;

public class Triangle
{
	private int sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	public Triangle()
	{
	   setSides(0,0,0);
	   perimeter=0;
	   theArea=0;

	}

	public Triangle(int a, int b, int c)
	{
      sideA = a;
      sideB = b;
      sideC = c;
	}


	public void setSides(int a, int b, int c)
	{
      if(a>0)
      {
      sideA = a;
      sideB = b;
      sideC = c;
      }
	}

	public void calcPerimeter( )
	{
      int a = sideA;
      int b = sideB;
      int c = sideC;
      perimeter = a+b+c;
	}

	public void calcArea( )
	{
      int a = sideA;
      int b = sideB;
      int c = sideC;
		double s = perimeter / 2;
      theArea = Math.sqrt(s*(s-a)*(s-b)*(s-c));

	}

	public void print( )
	{
      int a = sideA;
      int b = sideB;
      int c = sideC;
		System.out.println("\n");
      System.out.println(a+" "+b+" "+c);
      System.out.printf("%.5f",theArea);
      System.out.println("\n\n");
	}
	
	//create a print method or toString or both
	
	public String toString()
	{
		return "";
	}
}