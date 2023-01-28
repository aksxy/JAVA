/* package codechef; // don't place package name! 
Problem
Chef has scored A, B,A,B, and CC marks in 33 different subjects respectively.

Chef will fail if the average score of any two subjects is less than 3535. Determine whether Chef will pass or fail.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers A, B, CA,B,C, denoting the Chef's score in the three subjects.*/

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
		int a,b,c;
		while(t-->0)
		{
		    a=in.nextInt();
		    b=in.nextInt();
		    c=in.nextInt();
		    if((a+b)/2>=35 && (a+c)/2>=35 && (b+c)/2>=35)
		    System.out.println("PASS");
		    else
		    System.out.println("FAIL");
		}
	}
}
