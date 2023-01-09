/*Problem
Ashu and Arvind participated in a coding contest, as a result of which they received NN chocolates. Now they want to divide the chocolates between them equally.

Can you help them by deciding if it is possible for them to divide all the NN chocolates in such a way that they each get an equal number of chocolates?

You cannot break a chocolate in two or more pieces. */

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
		int n,t=in.nextInt();
		while(t-->0)
		{
		    n=in.nextInt();
		    if((n%2)==0)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
