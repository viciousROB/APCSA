//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size)
	{
   //set the array size
   myMonsters = new Monster[size];
   }

	public void add(int spot, Monster m)
	{
   myMonsters[spot] = m;
		//put m in the Monster array at [spot]
	}

	public Monster getLargest( )
	{
   Monster big=myMonsters[0];
   for(int i=0;i<myMonsters.length;i++){
      if(big.getHeight()<myMonsters[i].getHeight()){
         big = myMonsters[i];
         }
   }
		return big;
	}

	public Monster getSmallest( )
	{
   Monster small=myMonsters[0];
   for(int i=0;i<myMonsters.length;i++){
      if(small.getHeight()>myMonsters[i].getHeight()){
         small = myMonsters[i];
         }
   }
		return small;
	}

	public String toString()
	{
   //print each object with this method to make it into a string and use in other parts
      String r = "[";
      for(int iter = 0; iter < myMonsters.length; iter++){
         r += myMonsters[iter].toString();
         if(iter != myMonsters.length-1){
            r += ", ";
         }
         
      }
      r+="]";
		return r;
	}
}