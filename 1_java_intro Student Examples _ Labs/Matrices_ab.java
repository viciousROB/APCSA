import java.util.Scanner;

public class Matrices_ab
{
    public static void main(String[] args) 
    {
      char x1 = 'X';
      char x2 = 'x';
      char o1 = 'O';
      char o2 = 'o';
      int v = 1;
    while(v <= 1)
    {
		Scanner kb = new Scanner( System.in );
      System.out.print("Choose X or O :: ");
      char XO = kb.next().charAt(0);
      
      if(XO == o1)
      {
      System.out.print("Computer Plays First");
      v = 2;
      }
      else if(XO == o2)
      {
      System.out.print("Computer Plays First");
      v = 2;
      }
      
      else if(XO == x1)
      {
      System.out.print("You Play First");
      v = 3;
      }
      else if(XO == x2)
      {
      System.out.print("You Play First");
      v = 3;
      }
      
      else
      {
      System.out.print("Unsupported Character, Please Pick Again");
      System.out.println();
      System.out.println();
      }
    }
    //System.out.println( v(v) ); 
   }
   
   public static void drawboard(String[] args)
   {
   System.out.println("  *  *  ");
   System.out.println("  *  *  ");
   System.out.println("********");
   System.out.println("  *  *  ");
   System.out.println("  *  *  ");
   System.out.println("********");
   System.out.println("  *  *  ");
   System.out.println("  *  *  ");
   }
   
   
   
}
