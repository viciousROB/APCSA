//© A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 9/13/2019
//Class - 4th Period
//Lab  - Stars and Stripes Lab

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
      out.println("********************");
   }

   public void printTwentyDashes()
   {
      out.println("--------------------");
   }

   public void printTwoBlankLines()
   {
      out.println();
      out.println();
   }
   
   public void printASmallBox()
   {	
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
      printTwentyStars();
      printTwentyDashes();
   }
 
   public void printABigBox()
   { 	
      printASmallBox();
      printASmallBox();
   }   
}