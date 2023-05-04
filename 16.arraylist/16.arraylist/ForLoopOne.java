//(c) A+ Computer Science
// www.apluscompsci.com

//for loop example 1

import java.util.ArrayList;
import static java.lang.System.*;

public class ForLoopOne
{
	public static void main(String args[])
	{
		ArrayList<Integer> ray;
		ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
		ray.add(66);
		ray.add(53);
		ray.add(111);
		ray.add(336);
		ray.add(763);

		for( int i = 0; i < ray.size(); i++)
		{
			System.out.println( ray.get(i) );
		}
	}
}