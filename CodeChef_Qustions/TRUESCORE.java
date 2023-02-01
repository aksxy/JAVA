/* package codechef; // don't place package name! 

Problem
Chef is watching a football match. The current score is A:BA:B, that is, team 11 has scored AA goals and team 22 has scored BB goals. Chef wonders if it is possible for the score to become C:DC:D at a later point in the game (i.e. team 11 has scored CC goals and team 22 has scored DD goals). Can you help Chef by answering his question?

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first line of each test case contains two integers AA and BB - the intial number of goals team 11 and team 22 have scored respectively.
The second line of each test case contains two integers CC and DD - the final number of goals team 11 and team 22 must be able to score respectively.*/

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
		int t = in.nextInt();
		int a,b,c,d,i;
		for(i=1;i<=t;i++)
		{
		    a=in.nextInt();
		    b=in.nextInt();
		    c=in.nextInt();
		    d=in.nextInt();
		    if(a<=c && b<=d)
		    {
		        System.out.println("POSSIBLE");
		    }
		    else
		    System.out.println("IMPOSSIBLE");
		}
	}
}
