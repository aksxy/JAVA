/* package codechef; // don't place package name! 
Problem
For each bill you pay using CRED, you earn XX CRED coins.
At CodeChef store, each bag is worth 100100 CRED coins.

Chef pays YY number of bills using CRED. Find the maximum number of bags he can get from the CodeChef store.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, two integers XX and YY.*/

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
		int x,y;
		while(t-->0)
		{
		    x=in.nextInt();
		    y=in.nextInt();
		    if((x*y)>=100)
		        System.out.println((x*y)/100);
		    else
		    System.out.println("0");
		}
	}
}
