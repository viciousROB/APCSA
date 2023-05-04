//(c) A+ Computer Science
// www.apluscompsci.com

//int math example

import static java.lang.System.*;
import java.util.Arrays; 

public class IntMath
{
   public static void main( String args[] )
   {
int[] arr = {4, 3, 2, 1, 0};

int total = 0;

for (int k = 0; k <= total; k++)

{

if (arr[k] % 2 == 0)

{

total += arr[k];

}

else

{

total -= arr[k];

}

}

System.out.print(total);
   }
}