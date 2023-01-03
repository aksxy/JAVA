/* package codechef; // don't place package name! 
Problem
Recently Chef joined a new company. In this company, the employees have to work for XX hours each day from Monday to Thursday. Also, in this company, Friday is called Chill Day — employees only have to work for YY hours (Y \lt X)(Y<X) on Friday. Saturdays and Sundays are holidays.

Determine the total number of working hours in one week.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space-separated integers XX and YY — the number of working hours on each day from Monday to Thursday and the number of working hours on Friday respectively.*/

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
		    System.out.println((x*4)+(y*1));
		}
	}
}
