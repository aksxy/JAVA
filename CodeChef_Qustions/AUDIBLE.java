/* package codechef; // don't place package name! 
Problem

   Chef's dog binary hears frequencies starting from 6767 Hertz to 4500045000 Hertz (both inclusive).

   If Chef's commands have a frequency of XX Hertz, find whether binary can hear them or not.*/

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
		int x;
		while(t-->0)
		{
		    x=in.nextInt();
		    if(x>=67)
		    {
		        if(x<=45000)
		        System.out.println("YES");
		        else
		        System.out.println("NO");
		    }
		    else
		    System.out.println("NO");
		}
	}
}
