/* Problem
King loves to go on tours with his friends.

King has NN cars that can seat 55 people each and MM cars that can seat 77 people each. Determine the maximum number of people that can travel together in these cars. */

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
		int n,m,t=in.nextInt();
		while(t-->0)
		{
		    n=in.nextInt();
		    m=in.nextInt();
		    System.out.println((n*5)+(m*7));
		}
	}
}
