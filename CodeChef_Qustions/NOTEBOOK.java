/* package codechef; // don't place package name! 
Problem
You know that 11 kg of pulp can be used to make 10001000 pages and 11 notebook consists of 100100 pages.

Suppose a notebook factory receives NN kg of pulp, how many notebooks can be made from that?

Input Format
First line will contain TT, the number of test cases. Then the test cases follow.
Each test case contains a single integer NN - the weight of the pulp the factory has (in kgs).*/

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
		    int n=in.nextInt();
		    System.out.println((1000*n)/100);
		}
	}
}
