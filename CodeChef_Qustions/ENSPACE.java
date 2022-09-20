/* package codechef; // don't place package name! 
Problem
Chef's computer has NN GB of free space. He wants to save XX files, each of size 1 GB and YY files, each of size 2 GB on his computer. Will he be able to do so?

Chef can save all the files on his computer only if the total size of the files is less than or equal to the space available on his computer.

Input Format
The first line contains an integer TT, denoting the number of test cases. The TT test cases then follow:
The first and only line of each test case contains three integers N, X, YN,X,Y, denoting the free-space in computer, the number of 1 and 2 GB files respectively.*/

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
		int n,x,y,a=0;
		while(t-->0)
		{
		    n=in.nextInt();
		    x=in.nextInt();
		    y=in.nextInt();
		    if((y*2)+x <= n)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}
	}
}
