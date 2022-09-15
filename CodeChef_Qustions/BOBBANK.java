/* package codechef; // don't place package name! 

Problem
Bob has an account in the Bobby Bank. His current account balance is WW rupees.

Each month, the office in which Bob works deposits a fixed amount of XX rupees to his account.
YY rupees is deducted from Bob's account each month as bank charges.

Find his final account balance after ZZ months. Note that the account balance can be negative as well.

Input Format
The first line will contain TT, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing four integers W,X,Y,W,X,Y, and ZZ — the initial amount, the amount deposited per month, the amount deducted per month, and the number of months.*/

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
		int w,x,y,z;
		while(t-->0)
		{
		    w = in.nextInt(); //current balance
		    x = in.nextInt(); //each month deposite
		    y = in.nextInt(); //bank charges
		    z = in.nextInt(); //months
		    while(z-->0)
		    {
		        w = w + x;
		        w = w - y;
		    }
		    System.out.println(w);
		}
	}
}
