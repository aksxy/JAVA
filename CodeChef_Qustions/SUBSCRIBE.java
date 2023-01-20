/* package codechef; // don't place package name! 
Problem
Chef wants to conduct a lecture for which he needs to set up an online meeting of exactly XX minutes.

The meeting platform supports a meeting of maximum 3030 minutes without subscription and a meeting of unlimited duration with subscription.

Determine whether Chef needs to take a subscription or not for setting up the meet.

Input Format
First line will contain TT, the number of test cases. Then the test cases follow.
Each test case contains a single integer XX - denoting the duration of the lecture.*/

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
		while(t-->0)
		{
		    int x=in.nextInt();
		    if(x<=30)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		    
		}
	}
}
