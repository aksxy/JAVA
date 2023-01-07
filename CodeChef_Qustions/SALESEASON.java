/* package codechef; // don't place package name! 
Problem
It's the sale season again and Chef bought items worth a total of XX rupees. The sale season offer is as follows:

if X≤100, no discount.
if 100<X≤1000, discount is 25 rupees.
if 1000<X≤5000, discount is 100 rupees.
if X>5000, discount is 500 rupees.
Find the final amount Chef needs to pay for his shopping.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of single line of input containing an integer XX.*/

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
		    if(x>=100 && x<=1000)
		    System.out.println(x-25);
		    else if(x>1000 && x<=5000)
		    System.out.println(x-100);
		    else if(x>5000)
		    System.out.println(x-500);
		    else
		    System.out.println(x);
		}
	}
}
