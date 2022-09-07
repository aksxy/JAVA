/* package codechef; // don't place package name! */
/*
1.In the current semester, you have taken XX RTP courses, YY Audit courses and ZZ Non-RTP courses.

The credit distribution for the courses are:

44 credits for clearing each RTP course.
22 credits for clearing each Audit course.
No credits for clearing a Non-RTP course.
Assuming that you cleared all your courses, report the number of credits you obtain this semester.
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
		Scanner in = new Scanner(System.in);
		 
		 int T=in.nextInt();
		 
		 for(int i = 1;i<=T;i++)
		 {
		     int X=in.nextInt(); //RTP 4
		     int Y=in.nextInt(); //Adit 2
		     int Z=in.nextInt(); //Non Rtp 0
		     
		     X = X * 4;
		     Y = Y * 2;
		     System.out.println(X+Y);
		 
		 }
	}
}
