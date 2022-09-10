/* package codechef; // don't place package name! 

Problem
The National Championships are starting soon. There are 44 race categories, numbered from 11 to 44, that Chef is interested in. Chef is participating in exactly 22 of these categories.

Chef has an arch-rival who is, unfortunately, the only person participating who is better than Chef, i.e, Chef can't defeat the arch-rival in any of the four race categories but can defeat anyone else. Chef's arch-rival is also participating in exactly 22 of the four categories.

Chef hopes to not fall into the same categories as that of the arch-rival.

Given X, Y, A, BX,Y,A,B where X, YX,Y are the races that Chef participates in, and A, BA,B are the races that Chef's arch-rival participates in, find the maximum number of gold medals (first place) that Chef can win.*/

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
		int x,y,a,b,medal=2;
		for(int i=1;i<=t;i++)
		{
		    x=in.nextInt();
		    y=in.nextInt();
		    a=in.nextInt();
		    b=in.nextInt();
		    if(x==a || x==b)
		    {
		        medal--;
		    }
		    else if(y==a || y==b)
		    {
		        medal--;
		    }
		    System.out.println(medal);
		}
	}
}
