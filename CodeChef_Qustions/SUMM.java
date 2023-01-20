/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. 
Problem
Bob received an assignment from his school: he has two numbers AA and BB, and he has to find the sum of these two numbers.
Alice, being a good friend of Bob, told him that the answer to this question is CC.
Bob doesn't completely trust Alice and asked you to tell him if the answer given by Alice is correct or not.
If the answer is correct print "YES", otherwise print "NO" (without quotes).*/
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int A,B,C,T=in.nextInt();
		while(T-->0)
		{
		    A=in.nextInt();
		    B=in.nextInt();
		    C=in.nextInt();
		    if((A+B)==C)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
