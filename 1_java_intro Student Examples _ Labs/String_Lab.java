import java.util.Scanner;

public class String_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter a word :: ");
        String text = kb.next();
        //print out the first and last letter of the word
        int length = text.length();
        System.out.println( "First Letter of Word is " + text.substring(0,1) ); 
        System.out.println( "Last Letter of Word is " + text.substring(length-1) ); 
        
        //print out the word backwards


        char[] backwards = text.toCharArray();
        for(int x = backwards.length - 1; x >= 0; x--)
        System.out.print(backwards[x]);
        System.out.println();

        //check to see if the word contains a vowel
        
        
        for(int i=0;i <text.length();i++)
        {
        if      ((text.charAt(i) == 'a') || 
                (text.charAt(i) == 'e') ||
                (text.charAt(i) == 'i') || 
                (text.charAt(i) == 'o') ||
                (text.charAt(i) == 'u')) 
        {
                System.out.println("Detected Vowel " + text.charAt(i));
        }
        }
        //only check for 5 lowercase vowels
               
    }
}
