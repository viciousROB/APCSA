//(c) A+ Computer Science
// www.apluscompsci.com

//array delete example

import static java.lang.System.*;
import java.util.*;

public class ListCount
{
	/*
	 * countIt should return a count that
	 * states how many times val exists
	 * in the array iList
	 */
	public static int countIt( List<Integer> iList, int val )
	{
		return 0;
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