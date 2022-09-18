/* package codechef; // don't place package name! 
Problem
In ChefLand, human brain speed is measured in bits per second (bps). Chef has a threshold limit of XX bits per second above which his calculations are prone to errors. If Chef is currently working at YY bits per second, is he prone to errors?

If Chef is prone to errors print YES, otherwise print NO.

Input Format
The only line of input contains two space separated integers XX and YY — the threshold limit and the rate at which Chef is currently working at.*/

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
		int x=in.nextInt();
		int y=in.nextInt();
		if(x<y)
		System.out.println("YES");
		else
		System.out.println("NO");
	}
}
