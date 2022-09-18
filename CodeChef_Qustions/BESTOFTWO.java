/* package codechef; // don't place package name! 

Problem
Chef took an examination two times. In the first attempt, he scored XX marks while in the second attempt he scored YY marks. According to the rules of the examination, the best score out of the two attempts will be considered as the final score.

Determine the final score of the Chef.

Input Format
The first line contains a single integer TT — the number of test cases. Then the test cases follow.
The first line of each test case contains two integers XX and YY — the marks scored by Chef in the first attempt and second attempt respectively.*/

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
		while(t-->0)
		{
		    int x=in.nextInt();
		    int y=in.nextInt();
		    if(x<y)
		    System.out.println(y);
		    else
		    System.out.println(x);
		}
	}
}
