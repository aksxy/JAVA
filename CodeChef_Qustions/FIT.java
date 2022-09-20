/* package codechef; // don't place package name! 

Problem
Chef wants to become fit for which he decided to walk to the office and return home by walking. It is known that Chef's office is XX km away from his home.

If his office is open on 55 days in a week, find the number of kilometers Chef travels through office trips in a week.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line consisting of single integer XX.*/

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
		while(t-->0)
		{
		    int x=in.nextInt();
		    
		    System.out.println((x+x)*5);
		}
	}
}
