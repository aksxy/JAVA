/* package codechef; // don't place package name! 

Problem
Ezio can manipulate at most XX number of guards with the apple of eden.

Given that there are YY number of guards, predict if he can safely manipulate all of them.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers XX and YY.*/

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
		int T=in.nextInt();
		for(int i=1;i<=T;i++)
		{
		    int X=in.nextInt();
		    int Y=in.nextInt();
		    if(X<Y)
		    {
		        System.out.println("NO");
		    }
		    else{
		        if(X>=Y)
		        System.out.println("YES");
		    }
		}
	}
}
