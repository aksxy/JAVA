/* package codechef; // don't place package name! 

Problem
Chef appeared for a placement test.

There is a problem worth XX points. Chef finds out that the problem has exactly 1010 test cases. It is known that each test case is worth the same number of points.

Chef passes NN test cases among them. Determine the score Chef will get.

NOTE: See sample explanation for more clarity.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers XX and NN, the total points for the problem and the number of test cases which pass for Chef's solution.*/

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
		   System.out.println(y*(x/10));
		   
		}
	}
}
