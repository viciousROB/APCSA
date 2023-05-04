import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private List<Toy> toyList;

	public ToyStore()
	{
		toyList= new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] toyNames = toys.split("\\s+");
      for(String name: toyNames){
         boolean inList = false;
         for(Toy e: toyList)
            if(e.getName().equals(name)){
               e.setCount(e.getCount()+1);
               inList = true;
            }
         if(!inList)
         {
         toyList.add(new Toy(name));
         }
      
   }
  }
  	public Toy getThatToy(String name)
  	{
  		for(Toy x : toyList)
		{
			if(x.getName().equals(name))
			{
				return x;
			}
		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
      int maxCount=0;
		for(Toy x: toyList)
			if(x.getCount() > maxCount)
				maxCount = x.getCount();
            
      for(Toy e: toyList)
         if(maxCount == e.getCount())
            return e.getName();
      return null;
  	}
  
  	public void sortToysByCount()
  	{

  	}  
  	  
	public String toString()
	{
   return "" + toyList;
   }
   }