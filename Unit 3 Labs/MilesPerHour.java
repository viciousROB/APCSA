//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 10/1/19
//Class - 4th Period
//Lab  - oop Return MilesPerHour

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
   private double time;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
   distance = dist;
   hours = hrs;
   minutes = mins;
   time = (double)mins/60+(double)hrs;
	}

	public void setNums(int dist, int hrs, int mins)
	{
   if(distance>0)
   {
   distance = dist;
   hours = hrs+mins/60;
   minutes = mins;
   }
	}

	public void calcMPH()
	{
   mph = distance/time;
	}

	public void print()
	{
   System.out.print(distance);
   System.out.print(" miles in ");
   System.out.print(hours);
   System.out.print(" hour and ");
   System.out.print(minutes);
   System.out.print(" minutes = ");
   System.out.printf("%.0f",mph);
   System.out.print(" MPH.");

   	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}