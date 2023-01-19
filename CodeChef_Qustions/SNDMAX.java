/* package codechef; // don't place package name! 
Problem
Problem Statement
Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.

Input
First line contains the number of triples, N.
The next N lines which follow each have three space separated integers.
Output
For each of the N triples, output one new line which contains the second-maximum integer among the three.*/

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
		int[] n=new int[3];
		while(t-->0)
		{
		    n[0]=in.nextInt();
		    n[1]=in.nextInt();
		    n[2]=in.nextInt(); 
		    if((n[0]<n[1] && n[0]>n[2]) || (n[0]>n[1] && n[0]<n[2]))
		    System.out.println(n[0]);
		    else if((n[1]<n[0] && n[1]>n[2]) || (n[1]>n[0] && n[1]<n[2]))
		    System.out.println(n[1]);
		    else
		    System.out.println(n[2]);
		}
		
	}
}
