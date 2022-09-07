/* package codechef; // don't place package name!

Problem
Chef has to travel to another place. For this, he can avail any one of two cab services.

The first cab service charges XX rupees.
The second cab service charges YY rupees.
Chef wants to spend the minimum amount of money. Which cab service should Chef take?

Input Format
The first line will contain TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.*/

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
		int T=in.nextInt();
		for(int i = 1; i<=T;i++)
		{
		    int X=in.nextInt();
		    int Y=in.nextInt();
		    if(X<Y)
		    {
		        System.out.println("FIRST");
		    }
		    else{
		        if(X==Y)
		        {
		            System.out.println("ANY");
		        }
		        else
		        {
		            System.out.println("SECOND");
		        }
		    }
		}
	}
}
