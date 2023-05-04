//(c) A+ Computer Science
// www.apluscompsci.com

//ArrayList get() example

import java.util.ArrayList;
import static java.lang.System.*;

public class Get
{
   public static void main(String args[])
	{
		ArrayList<Integer> ray = new ArrayList<Integer>();

		ray.add(23);
		ray.add(11);
		ray.add(12);
		ray.add(65);

	   out.println( ray.get(0) );
	   out.println( ray.get(1) );
	   out.println( ray.get(2) );
	   out.println( ray.get(3) );
	   
	   //bad
	   //uncomment the line below and re-run the code
	   //out.println( ray.get( 4 ) );
	}
}