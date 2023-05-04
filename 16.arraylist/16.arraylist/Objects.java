//(c) A+ Computer Science
// www.apluscompsci.com

//ArrayList Objects example

import java.util.ArrayList;
import java.util.List;
import static java.lang.System.*;

public class Objects
{
   public static void main(String args[])
	{
		List aplus = new ArrayList();
		aplus.add("hello");
		aplus.add("whoot");
		aplus.add("contests");
		out.println(((String)aplus.get(0)).charAt(0));
		out.println(((String)aplus.get(2)).charAt(0));
	}
}