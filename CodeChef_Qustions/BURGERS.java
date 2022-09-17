/* package codechef; // don't place package name! 
Problem
Chef is fond of burgers and decided to make as many burgers as possible.

Chef has AA patties and BB buns. To make 11 burger, Chef needs 11 patty and 11 bun.
Find the maximum number of burgers that Chef can make.

Input Format
The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains two space-separated integers AA and BB, the number of patties and buns respectively.*/

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
		    int a=in.nextInt();
		    int b=in.nextInt();
		    if(a<=b)
		     System.out.println(a);
		     else
		     System.out.println(b);
		}
	}
}
