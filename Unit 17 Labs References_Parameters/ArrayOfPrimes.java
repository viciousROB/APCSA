//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Cedric MCEnroe
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class ArrayOfPrimes
{
	//instance variables and constructors could be present, but are not necessary
	
	//getPrimeList(int numPrimes) will return an array 
	//containing the first numPrimes primes starting at 2
	public static int[] getPrimeList(int numPrimes)
	{
      
		return getPrimeList(numPrimes,2);  //just call a method here
	}

	//getPrimeList(int numPrimes, int primeStart) will return an array 
	//containing the first numPrimes primes starting at primeStart
	public static int[] getPrimeList(int numPrimes, int primeStart)
	{
		int[] primes = new int[numPrimes];	
      int x=0;
      int primeStrt=primeStart;
      while(x<numPrimes)
      {
      if(isPrime(primeStrt)==true){
      primes[x]=primeStrt;
      primeStrt++;
      x++;
      }
      else
      {
      primeStrt++;
      }
      }
			//you must call isPrime	
		return primes;
	}
		
	//isPrime will return true if num is prime
	//a prime number is any number ony divisible by 1 and itself
	private static boolean isPrime(int num)
	{
   if(num<=2)
   return false;
   else
   return(num%2)!=0
   &&
   IntStream.rangeClosed(3,(int)Math.sqrt(num))
   .filter(n -> n%2!=0)
   .noneMatch(n -> (num%n==0));
	}
}