/* package codechef; // don't place package name! 

Problem
Chef has NN friends. Chef promised that he would gift a pair of shoes (consisting of one left shoe and one right shoe) to each of his NN friends. Chef was about to go to the marketplace to buy shoes, but he suddenly remembers that he already had MM left shoes.

What is the minimum number of extra shoes that Chef will have to buy to ensure that he is able to gift a pair of shoes to each of his NN friends?

For example, if N = 2N=2, M = 4M=4, then Chef already has 44 left shoes, so he must buy 22 extra right shoes to form 22 pairs of shoes.

Therefore Chef must buy at least 22 extra shoes to ensure that he is able to get N = 2N=2 pairs of shoes.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first line of each test case contains two integers NN and MM - the number of Chef's friends and the number of left shoes Chef has.*/

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
		int testcase=in.nextInt();
		int n,m,i;
		for(i=1;i<=testcase;i++)
		{
		    n = in.nextInt();//friends
		    m = in.nextInt();//allredy have left shoes
		    
		    if(n<m)
		    {     
		
		          System.out.println((n*2)-n);  
		    }
		    
		        else if(n>=m)
		        {

		             System.out.println((n*2)-m);
		        }
		 
		}
	}
}
