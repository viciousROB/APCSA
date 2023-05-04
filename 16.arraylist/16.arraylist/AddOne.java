//(c) A+ Computer Science
// www.apluscompsci.com

//ArrayList add() example

import java.util.ArrayList;
import static java.lang.System.*;

public class AddOne
{
   public static void main(String args[])
	{
		ArrayList<String> vals;
		vals = new ArrayList<String>();
		
		vals.add("aplus");
		vals.add("rocks");
		vals.add(0, "comp");
		vals.add(1, "sci");
		out.println(vals);
	}
}