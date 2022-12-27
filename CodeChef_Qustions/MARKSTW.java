/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. 
Problem
Alice has scored XX marks in her test and Bob has scored YY marks in the same test. Alice is happy if she scored at least twice the marks of Bob’s score. Determine whether she is happy or not.

Input Format
The first and only line of input contains two space-separated integers X, YX,Y — the marks of Alice and Bob respectively.*/
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		if((y*2)<=x)
		System.out.println("Yes");
		else
		System.out.println("No");
		
		
	
	}
}
