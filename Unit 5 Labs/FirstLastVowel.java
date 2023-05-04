//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric McEnroe
//Date - 10/17/19


public class FirstLastVowel
{
   public static String go( String a )
	{
   String b = a.substring(0,1)+a.substring(a.length()-1,a.length());
		if(b.contains("a")||b.contains("e")||b.contains("i")||b.contains("o")||b.contains("u")||b.contains("A")||b.contains("E")||b.contains("I")||b.contains("O")||b.contains("U"))
      return"yes";
      else
      return"no";
	}
}