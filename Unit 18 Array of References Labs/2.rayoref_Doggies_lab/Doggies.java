//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric MCEnroe

import java.util.Arrays;
import java.lang.Math;

import static java.lang.System.*;


public class Doggies
{
	private Dog[] pups;
private int size;
	public Doggies(int size)
	{
		pups = new Dog[size];
		//this.size = size;
		//point pups at a new arry of Dog
		
	}
	
	public void set(int spot, int age, String name)
	{
		//if (spot >= 0 && spot < pups.length)
			pups[spot] = new Dog(age, name);

		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
	}

	public String getNameOfOldest()
	{
		Dog oldest = pups[0];
		int ageu = 0;
		for (Dog d : pups) {
			if (d.getAge() > ageu) {
				oldest = d;
				ageu = d.getAge();
			}
		}
		return oldest.getName();
	}

	public String getNameOfYoungest()
	{
Dog youngest = pups[0];
		int aged = Integer.MAX_VALUE;
		for (Dog d : pups) {
			if (d.getAge() < aged) {
				youngest = d;
				aged = d.getAge();
			}
		}
		return youngest.getName();
	}

	public String toString()
	{
return "" + Arrays.toString(pups);
	}
}