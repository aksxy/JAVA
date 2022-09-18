/* package codechef; // don't place package name! 
Problem
Chef's coding class is very famous in Chefland.

This year XX students joined his class and each student will require one chair to sit on. Chef already has YY chairs in his class. Determine the minimum number of new chairs Chef must buy so that every student is able to get one chair to sit on.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and YY — the number of students in the class and the number of chairs Chef already has.*/

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
		    if(x>=y)
		    System.out.println(x-y);
		    else
		    System.out.println("0");
		}
	}
}
