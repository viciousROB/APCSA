import java.util.List;
import java.util.ArrayList;

public class List_Lab
{
	
	public static void main(String[] args) 
   {
		List<Integer> numbers = new ArrayList<Integer>();
		//add at least 5 numbers to the list then print the list
		//use a loop and math.random() if you feel froggy

      numbers.add(43);
    	numbers.add(96);
      numbers.add(52);
    	numbers.add(11);
    	numbers.add(80);
      System.out.println( numbers );
    		
    	//set the 3rd number to equal 10 then print the list
    	numbers.set(2,10);
      System.out.println( numbers );

    	//remove the 2nd number in the list then print the list
    	numbers.remove(1);
      System.out.println( numbers );
    	
    	//This line calls the sumList method sending the 'numbers'
    	//list as a parameter. Write the sumList method below
    	//which should return an int value = sum of all numbers in list
   		System.out.println( sumList( numbers ) );     
   }
   
   public static int sumList( List<Integer> list )
	{
    int sum = 0;
    for (int x: list)
      {
        sum += x;
      }
    return sum;
	}
	
}
