//(c) A+ Computer Science
// www.apluscompsci.com

//array of references as instance variable example

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Collections;

public class Herd_SOL
{
	private Creature[] things;

	public Herd_SOL()
	{
		//must size the array
		things = new Creature[10];
	}		
	
	public Herd_SOL(int size)
	{
		//must size the array
		things = new Creature[size];
	}	
	
	public void set(int spot, int creatureSize )
	{
		//set spot to new Creature	
		things[spot] = new Creature(creatureSize);	
	}
	
	public String toString()
	{
		return "" + Arrays.toString( things );
	}
}