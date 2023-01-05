/* package codechef; // don't place package name!
Problem
Our Chef is currently practicing on CodeChef and is a beginner. The count of ‘All Problems’ in the Beginner section is XX. Our Chef has already ‘Attempted’ YY problems among them. How many problems are yet ‘Un-attempted’?

Input Format
The first and only line of input contains two space-separated integers XX and YY — the count of 'All problems' in the Beginner's section and the count of Chef's 'Attempted' problems, respectively.*/

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
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println(x-y);
	}
}
