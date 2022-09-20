/* package codechef; // don't place package name! 
Problem
Janmansh has to submit 33 assignments for Chingari before 1010 pm and he starts to do the assignments at XX pm. Each assignment takes him 11 hour to complete. Can you tell whether he'll be able to complete all assignments on time or not?

Input Format
The first line will contain TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer XX - the time when Janmansh starts doing the assignemnts.*/

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
		    if((10-x)>=3)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
