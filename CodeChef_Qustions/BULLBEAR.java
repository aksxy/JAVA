/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public.
Problem
Chef is on his way to become the new big bull of the stock market but is a bit weak at calculating whether he made a profit or a loss on his deal.

Given that Chef bought the stock at value XX and sold it at value YY. Help him calculate whether he made a profit, loss, or was it a neutral deal.*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int X,Y,T=in.nextInt();
		while(T-->0)
		{
		    X=in.nextInt();
		    Y=in.nextInt();
		    if(X>Y)
		    System.out.println("LOSS");
		    else if(X==Y)
		    System.out.println("NEUTRAL");
		    else
		    System.out.println("PROFIT");
		}
	}
}
