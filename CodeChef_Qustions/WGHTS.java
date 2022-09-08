/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        for(int i=1; i<=T; i++)
        {
          int W = in.nextInt();
	        int X= in.nextInt();
	        int Y= in.nextInt();
	        int Z= in.nextInt();
	        if(W==X||W==Y||W==Z)
	            System.out.println("Yes");
	        else 
	        if(W==(X+Y)||W==(X+Z)||W==(Y+Z))
	
	        System.out.println("Yes");
	        else
	         if(W==(X+Y+Z))
	        System.out.println("Yes");
	        else
	        System.out.println("No");
        }
    }
}
