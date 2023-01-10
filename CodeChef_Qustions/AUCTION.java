/* Problem
Alice, Bob and Charlie are bidding for an artifact at an auction.
Alice bids AA rupees, Bob bids BB rupees, and Charlie bids CC rupees (where AA, BB, and CC are distinct).

According to the rules of the auction, the person who bids the highest amount will win the auction.
Determine who will win the auction. */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int A,B,C,T=in.nextInt();
		while(T-->0)
		{
		    A=in.nextInt();
		    B=in.nextInt();
		    C=in.nextInt();
		    if(A>=B && A>=C)
		    System.out.println("Alice");
		    else if(B>=A && B>=C)
		    System.out.println("Bob");
		    else
		    System.out.println("Charlie");
		}
	}
}
