/* package codechef; // don't place package name! 

Problem
     In Chefland, a tax of rupees 1010 is deducted if the total income is strictly greater than rupees 100100.

      Given that total income is XX rupees, find out how much money you get.*/

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
		int x;
		while(t-->0)
		{
		    x=in.nextInt();
		    if(x>100)
		    System.out.println(x-10);
		    else
		    System.out.println(x);
		}
	}
}
