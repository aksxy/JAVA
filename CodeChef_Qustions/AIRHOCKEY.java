/* package codechef; // don't place package name! 
Problem
Alice is playing Air Hockey with Bob. The first person to earn seven points wins the match. Currently, Alice's score is AA and Bob's score is BB.

Charlie is eagerly waiting for his turn. Help Charlie by calculating the minimum number of points that will be further scored in the match before it ends.

Input Format
The first line of input will contain an integer TT — the number of test cases. The description of TT test cases follows.
The first and only line of each test case contains two space-separated integers AA and BB, as described in the problem statement.*/

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
		int t = in.nextInt();
		while(t-->0)
		{
		    int a=in.nextInt();
		    int b=in.nextInt();
		    if(a>=b)
		    System.out.println((7-a));
		    else
		    System.out.println((7-b));
		}
	}
}
