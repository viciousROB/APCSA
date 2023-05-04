//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
//Lab  -  

import static java.lang.System.*;
import java.util.Scanner;

public class HexToBinary
{
	public static String getBinary( char hex )
	{
   int h = (int)hex;
   String p = Integer.toBinaryString(h);
   System.out.println(hex+" is "+p+" in binary");
   return "";
   }
}