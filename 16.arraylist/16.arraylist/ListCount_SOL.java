//(c) A+ Computer Science
// www.apluscompsci.com

//array delete example

import static java.lang.System.*;
import java.util.*;

public class ListCount_SOL
{
	/*
	 * countIt should return a count that
	 * states how many times val exists
	 * in the array iList
	 */
	public static int countIt( List<Integer> iList, int val )
	{
		int count = 0;
		for(int item : iList )
		{
			if( item == val )
			{
				count = count + 1;
			}
		}
		return count;
	}

	public static void printIt( List<Integer> iList  )
	{
		for(int item : iList )
		{
			out.print(item + " ");
		}
	}

	public static void main(String[] args)
	{
		List<Integer> nums = new ArrayList<Integer>( Arrays.asList( 7,7,1,7,8,7,4,3,7, 9,8 ));

		printIt( nums );
		System.out.println("\ncount of 7s == " + countIt( nums, 7 ));
	}
}