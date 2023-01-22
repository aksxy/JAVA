/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public.

Problem
Alice and Bob were having an argument about which of them is taller than the other. Charlie got irritated by the argument, and decided to settle the matter once and for all.

Charlie measured the heights of Alice and Bob, and got to know that Alice's height is XX centimeters and Bob's height is YY centimeters. Help Charlie decide who is taller.

It is guaranteed that X \neq YX=Y.

Input Format
The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains two integers XX and YY, as described in the problem statement.
Output Format
For each test case, output on a new line \texttt{A}A if Alice is taller than Bob, else output \texttt{B}B. The output is case insensitive, i.e, both \texttt{A}A and \texttt{a}a will be accepted as correct answers when Alice is taller.*/
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
		    if(x<y)
		    System.out.println("B");
		    else
		    System.out.println("A");
		}
	}
}
