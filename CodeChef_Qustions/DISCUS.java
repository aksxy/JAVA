/* package codechef; // don't place package name! 
Problem
In discus throw, a player is given 33 throws and the throw with the longest distance is regarded as their final score.

You are given the distances for all 33 throws of a player. Determine the final score of the player.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers A, B,A,B, and CC denoting the distances in each throw.*/

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
		int testcase=in.nextInt();
		int a,b,c,i;
		for(i=1;i<=testcase;i++)
		{
		    a=in.nextInt();
		    b=in.nextInt();
		    c=in.nextInt();
		    if(a>=b && a>=c)
		    System.out.println(a);
		    else if(b>=a && b>=c)
		    System.out.println(b);
		    else
		    System.out.println(c);
		}
		
	}
}
