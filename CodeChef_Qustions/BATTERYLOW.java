/* package codechef; // don't place package name! 

Problem
Chef's phone shows a Battery Low notification if the battery level is 15 \%15% or less.

Given that the battery level of Chef's phone is X \%X%, determine whether it would show a Battery low notification.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains a single line of input, an integer XX, denoting the battery level of the phone.
Output Format
For each test case, output in a single line \texttt{Yes}Yes, if the battery level is 15 \%15% or below. Otherwise, print \text{No}No.*/

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
		for(int i=1;i<=t;i++)
		{
		    int x=in.nextInt();
		    if(x<=15)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
