import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
  
   ToyStore store = new ToyStore();
   System.out.println(store);
   store.loadToys("ball ball ball train train car car teddy teddy teddy ball");
   System.out.println(store);
   System.out.println("max == " + store.getMostFrequentToy());
			
	}
}