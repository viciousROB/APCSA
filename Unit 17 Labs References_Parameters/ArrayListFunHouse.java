//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric MCEnroe

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
	public static ArrayList<Integer> getListOfFactors(int number)
	{
      ArrayList<Integer> factors = new ArrayList<Integer>();
      for(int i=1;i<(Math.sqrt(number));i++)
      {
      if(number%i==0){
      factors.add(i);
      }

      }
      		return factors;
	}
	
	public static void keepOnlyCompositeNumbers( List<Integer> nums )
	{
   for(int i=0;i>nums.size();i++)
   {
   if(nums.get(i)%1!=0)
   {
   nums.remove(i);
   }
   }
	}
}