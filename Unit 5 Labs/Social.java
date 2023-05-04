//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric McEnroe
//Date - 10/17/19


public class Social
{
   public static String go( String a )
	{
      String b = a.substring(3,4)+a.substring(6,7);
      String c = "--";
      String d = a.substring(7,11);
      if(b.contains(c))
      {
      return d;
      }
      else
      return "bad";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/