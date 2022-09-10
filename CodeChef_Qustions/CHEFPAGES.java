/* package codechef; // don't place package name! 
Problem
MoEngage noticed that some users are not aware of the practice page on CodeChef, and some others are not aware of the rated contests on CodeChef. So, MoEngage wants to send an email to the users depending on which of the following groups they fall into:

If the user has never submitted on the practice page then send an email with the text:

https://www.codechef.com/practice

If the user has submitted on the practice page, but never participated in a contest then send an email with the text:

https://www.codechef.com/contests

If the user has submitted on the practice page as well as participated in a contest then send an email with the text:

https://discuss.codechef.com

so that they may discuss with other members of the community.

Help MoEngage by writing a program that takes as input two integers AA and BB where:

A = 1A=1 if the user has submitted on the practice page and 00 otherwise.
B = 1B=1 if the user has participated in a contest and 00 otherwise.
Output the appropriate link to be displayed in the email.*/

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
		int a=in.nextInt();
		int b=in.nextInt();
			if(a==1&&b==0)
            System.out.println("https://www.codechef.com/contests");
		else if(a==0)
		    System.out.println("https://www.codechef.com/practice");
		
        else
		    System.out.println("https://discuss.codechef.com");
	}
}
