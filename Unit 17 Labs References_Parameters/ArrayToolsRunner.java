//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.lang.Math;
import java.util.Arrays;

public class ArrayToolsRunner
{
	public static void main( String args[] )
	{
	   int[] theRay = {2,4,6,8,10,12,8,16,8,20,8,4,6,2,2};
	   
	   out.println("Original array : "+Arrays.toString(theRay));
	   
	   out.println("Sum of 3-6: "+ArrayTools.sumSection(theRay,3,6));
	   out.println("Count of 3s: "+ArrayTools.countVal(theRay,2)); 
	   //add more test cases
	   
	   	   
	}
}