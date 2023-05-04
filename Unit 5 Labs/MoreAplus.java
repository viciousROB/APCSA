//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric McEnroe
//Date - 10/15/19


public class MoreAplus
{
   public static String go( String a )
	{
  
     if(a.indexOf("aplus")!=-1)
     {
         int b = (a.indexOf("aplus"))+1;
         String c = a.substring(b);
      if(c.indexOf("aplus")!=-1)
      {
         return "yes";
      }
      else
      {
      return "no";
      }
     }
     return"no";
	}
}
