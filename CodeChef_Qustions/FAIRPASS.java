/* Problem
There is a fair going on in Chefland. Chef wants to visit the fair along with his NN friends. Chef manages to collect KK passes for the fair. Will Chef be able to enter the fair with all his NN friends?

A person can enter the fair using one pass, and each pass can be used by only one person.*/

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
		int n,k,t=in.nextInt();
		while(t-->0)
		{
		    n=in.nextInt();
		    k=in.nextInt();
		    if(n<k)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
