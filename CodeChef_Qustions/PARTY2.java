/* package codechef; // don't place package name! 
Problem
Chef wants to give a burger party to all his NN friends i.e. he wants to buy one burger for each of his friends.

The cost of each burger is XX rupees while Chef has a total of KK rupees.

Determine whether he has enough money to buy a burger for each of his friends or not.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains the three integers NN, XX, and KK - the number of Chef's friends, the cost of each burger, and the total money Chef has, respectively.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in= new Scanner(System.in);
		int t=in.nextInt();
		int n,x,k;
		while(t-->0)
		{
		    n=in.nextInt();
		    x=in.nextInt();
		    k=in.nextInt();
		    if((x*n)<=k)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
