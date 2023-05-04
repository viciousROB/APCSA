//(c) A+ Computer Science
//www.apluscompsci.com

//ArrayList remove() example

import java.util.ArrayList;
import static java.lang.System.*;

public class RemoveOne
{
	public static void main(String args[])
	{
		ArrayList<String> ray;
		ray = new ArrayList<String>();
		ray.add("a");
		ray.add("b");
		System.out.println( ray.remove(0) );
		ray.add("c");
		ray.add("d");
		ray.remove(0);
		System.out.println(ray);
	}
}