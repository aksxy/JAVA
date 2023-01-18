/* package codechef; // don't place package name! 

Problem
A person is said to be sleep deprived if he slept strictly less than 77 hours in a day.

Chef was only able to sleep XX hours yesterday. Determine if he is sleep deprived or not.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first and only line of each test case contains one integer XX — the number of hours Chef slept.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a = sc.nextInt();
		    if(a<7)
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		        System.out.println("NO");
		    }
		}
	}
}
