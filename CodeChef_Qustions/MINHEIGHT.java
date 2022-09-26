/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. 
Problem
Chef's son wants to go on a roller coaster ride. The height of Chef's son is XX inches while the minimum height required to go on the ride is HH inches. Determine whether he can go on the ride or not.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and HH - the height of Chef's son and the minimum height required for the ride respectively.*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		int x,h;
		while(t-->0)
		{
		    x=in.nextInt();
		    h=in.nextInt();
		    if(x>=h)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}
	}
}
