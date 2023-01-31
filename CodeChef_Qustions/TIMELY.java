/* package codechef; // don't place package name! 

Problem
     Chef has recently moved into an apartment. It takes 3030 minutes for Chef to reach office from the apartment.
     Chef left for the office XX minutes before Chef was supposed to reach. Determine whether or not Chef will be able to reach on time.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		int x;
		while(t-->0)
		{
		    x=in.nextInt();
		    if(x>=30)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
