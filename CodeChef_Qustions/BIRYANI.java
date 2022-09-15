/* package codechef; // don't place package name! 

Problem
According to a recent survey, Biryani is the most ordered food. Chef wants to learn how to make world-class Biryani from a MasterChef. Chef will be required to attend the MasterChef's classes for XX weeks, and the cost of classes per week is YY coins. What is the total amount of money that Chef will have to pay?

Input Format
The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains two space-separated integers XX and YY, as described in the problem statement.*/

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
		int x,y;
		while(t-->0)
		{
		    x=in.nextInt();
		    y=in.nextInt();
		    
		    System.out.println(y*x);
		}
	}
}
