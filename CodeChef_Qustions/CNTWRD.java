/* package codechef; // don't place package name! 

Problem
Harsh was recently gifted a book consisting of NN pages. Each page contains exactly MM words printed on it. As he was bored, he decided to count the number of words in the book.

Help Harsh find the total number of words in the book.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists of two space-separated integers on a single line, NN and MM — the number of pages and the number of words on each page, respectively.
Output Format
For each test case, output on a new line, the total number of words in the book.

*/

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
		int n,m;
		while(t-->0)
		{
		    n=in.nextInt();
		    m=in.nextInt();
		    System.out.println((n*m));
		}
	}
}
