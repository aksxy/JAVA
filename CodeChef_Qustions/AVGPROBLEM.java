/* package codechef; // don't place package name! */
/*
You are given 33 numbers A, B,A,B, and CC.

Determine whether the average of AA and BB is strictly greater than CC or not?

NOTE: Average of AA and BB is defined as \frac{(A+B)}{2} 
2
(A+B)

 . For example, average of 55 and 99 is 77, average of 55 and 88 is 6.56.5.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of 33 integers A, B,A,B, and CC.
Output Format
For each test case, output YES if average of AA and BB is strictly greater than CC, NO otherwise.
*/
import java.util.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		for(int i = 1;i <= T; i++)
		{
		    float A=in.nextFloat();
		    float B=in.nextFloat();
		    float C=in.nextFloat();
		    
		    if(C < (A+B)/2)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
