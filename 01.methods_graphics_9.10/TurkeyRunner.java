//(c) A+ Computer Science
// www.apluscompsci.com

//methods example 2 and 3

import static java.lang.System.*;

public class TurkeyRunner
{
   public static void main(String[] args)
   {
		System.out.println( "Test 1" );	   	
      Turkey bird = new Turkey();
      bird.speak();
      bird.sayName();
      bird.speak();
      bird.sayName();
      bird.speak();   

		System.out.println( "\n\nTest 2" );		
      Turkey it = new Turkey();
      it.sayName();
      it.sayName();    
      	
		System.out.println( "\n\nTest 3" );		
      //make more Turkeys and 
      //call the old methods and 
      //the new method you created             	 	        
   }
}