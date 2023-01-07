/* package codechef; // don't place package name! 
Problem
In a coding contest, there are prizes for the top rankers. The prize scheme is as follows:

Top 1010 participants receive rupees XX each.
Participants with rank 1111 to 100100 (both inclusive) receive rupees YY each.
Find the total prize money over all the contestants.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers XX and YY - the prize for top 1010 rankers and the prize for ranks 1111 to 100100 respectively.
Output Format
For each test case, output the total prize money over all the contestants.*/

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
		int t=in.nextInt();
		int x,y;
		while(t-->0)
		{
		    x=in.nextInt();
		    y=in.nextInt();
		    System.out.println((x*10)+(y*90));
		}
	}
}
