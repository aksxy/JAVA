/* package codechef; // don't place package name! 


Problem
The Chef has reached the finals of the Annual Inter-school Declamation contest.

For the finals, students were asked to prepare 1010 topics. However, Chef was only able to prepare three topics, numbered AA, BB and CC — he is totally blank about the other topics. This means Chef can only win the contest if he gets the topics AA, BB or CC to speak about.

On the contest day, Chef gets topic XX. Determine whether Chef has any chances of winning the competition.

Print "Yes" if it is possible for Chef to win the contest, else print "No".

You may print each character of the string in either uppercase or lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).*/

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
		int a,b,c,x;
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		x = in.nextInt();
		if(a==x || b==x || c==x)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
	}
}
