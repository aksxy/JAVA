/* Problem
Chef has recently started playing chess, and wants to play as many games as possible.

He calculated that playing one game of chess takes at least 2020 minutes of his time.

Chef has NN hours of free time. What is the maximum number of complete chess games he can play in that time?*/

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
		int n,t=in.nextInt();
		while(t-->0)
		{
		    n=in.nextInt();
		    System.out.println(n*3);
		}
	}
}
