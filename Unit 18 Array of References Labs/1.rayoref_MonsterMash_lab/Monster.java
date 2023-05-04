//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster
{
	private int myAge, mySize, myWeight;

	public Monster() 
	{ 
		myAge = mySize = myWeight = 0; 
	}

	public Monster(int age)
	{
	   myAge = age;
	}

	public Monster(int size, int weight, int age)
	{
	   myAge = age;
	   mySize = size;
      myWeight = weight;
	}

	public void setAge( int age)
	{ 
		myAge = age; 	
	}

	public int getAge()
	{ 
		return myAge; 
	}
   
   
	public int getHeight()
	{ 
		return mySize; 
	}
   
   	public int getWeight()
	{ 
		return myWeight; 
	}

/*	public boolean equals( Object obj )
	{
		Monster other = (Monster) obj;
		if( obj == null )
			return false;
		return myAge == other.myAge && mySize == other.mySize;
	}
*/
	public String toString()
	{
		return mySize + " " + myWeight + " " + myAge;
	}
}