//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric McEnroe
//Date - 10/15/19


public class First
{
   public static String go( String a )
	{
   String d = a.substring(1);
   if(d.indexOf(a.substring(0,1))!=-1)
   return"yes";
   else
   return"no";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/