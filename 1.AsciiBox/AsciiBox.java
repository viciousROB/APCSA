//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Cedric McEnroe
//Date - 9/3/2019
//Class - 4th period
//Lab  - AsciiBox 1

public class AsciiBox
{
	public static void main(String[] args)
	{
		System.out.println("Cedric McEnroe \t  9/3/2019 \n\n" );
      int x = 0;
      int y = 0;
      int z = 0;
      while(z<=2)
      {
         while(x<=2)
         {
		      System.out.println("+++++++++++++++++++++++++" );
            x = x + 1;
         }
         while(y<=1)
         {
            System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAA" );
            y = y + 1;
         }
      z = z + 1;
      x = x - 3;
      y = y - 2;
      }
      while(x<=2)
      {
		System.out.println("+++++++++++++++++++++++++" );
      x = x + 1;
      }

	}
}