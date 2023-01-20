/* package codechef; // don't place package name! 

Problem
A new TV streaming service was recently started in Chefland called the Chef-TV.

A group of NN friends in Chefland want to buy Chef-TV subscriptions. We know that 66 people can share one Chef-TV subscription. Also, the cost of one Chef-TV subscription is XX rupees. Determine the minimum total cost that the group of NN friends will incur so that everyone in the group is able to use Chef-TV.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers NN and XX — the size of the group of friends and the cost of one subscription.*/

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
		int n,x,ans=0,mode=0;
		while(t-->0)
		{
		    n=in.nextInt();
		    x=in.nextInt();
		    ans=n/6;
		    mode=n%6;
		    if(n<=6)
		         System.out.println(x);
		    else if(mode==0)
		        System.out.println(x*ans);
		    else
		    System.out.println((x*ans)+x);
		}
	}
}
