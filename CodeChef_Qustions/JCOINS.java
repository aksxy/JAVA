/* package codechef; // don't place package name! 
Problem
Janmansh received XX coins of 1010 rupees and YY coins of 55 rupees from Chingari. Since he is weak in math, can you find out how much total money does he have?

Input Format
The first line will contain TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX, YY - the number of 1010 and 55 rupee coins respectively.*/

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
		    int y=in.nextInt();
		    System.out.println((10*x)+(5*y));
		}
	}
}
