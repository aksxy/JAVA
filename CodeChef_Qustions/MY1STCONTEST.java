/* package codechef; // don't place package name!
Now to the problem:

In a contest where NN new users visited the contest,

AA users just saw the problems and didn’t make any submissions and hence won’t get any rating.
BB users who made a submission but could not solve any problem correctly. Thus, after the contest, they will get a rating in the range 800 - 1000800−1000.
Everyone else could correctly solve at least 11 problem. Thus, they will get a rating strictly greater than 10001000 after the contest.
You need to output the number of new users in the contest who, after the contest, will get a rating and also the number of new users who will get a rating strictly greater than 10001000.*/

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
		int n=in.nextInt();
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.print((n-a));
		System.out.print(" ");
		System.out.print((n-a)-b);
	}
}
