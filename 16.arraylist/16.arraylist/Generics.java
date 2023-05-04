//(c) A+ Computer Science
// www.apluscompsci.com

//ArrayList generics

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class Generics
{
   public static void main(String args[])
	{
		List<String> vals;
		vals = new ArrayList<String>();
		vals.add("aplus");
		vals.add("compsci");
		vals.add("contests");
		out.println(vals.get(0).charAt(0));
		out.println(vals.get(2).charAt(0));
		out.println(vals);

		out.println("\n\n");

		ArrayList<Long> bigList;
		bigList = new ArrayList<Long>();
		bigList.add(new Long(2));
		bigList.add(7L);
		bigList.add(65537765987l);
		out.println(bigList);
	}
}