/* package codechef; // don't place package name! 
Problem
Chef went shopping and bought items worth XX rupees (1 \le X \le 1001≤X≤100). Unfortunately, Chef only has a single 100100 rupees note.

Since Chef is weak at maths, can you help Chef in calculating what money he should get back after paying 100100 rupees for those items?

Input Format
First line will contain TT, the number of test cases. Then the test cases follow.
Each test case consists of a single line containing an integer XX, the total price of items Chef purchased.*/

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
		    System.out.println(100-x);
		}
	}
}
