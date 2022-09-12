/* package codechef; // don't place package name! 

Problem
Chef has finally got the chance of his lifetime to drive in the F1F1 tournament. But, there is one problem. Chef did not know about the 107% rule and now he is worried whether he will be allowed to race in the main event or not.

Given the fastest finish time as XX seconds and Chef's finish time as YY seconds, determine whether Chef will be allowed to race in the main event or not.

Note that, Chef will only be allowed to race if his finish time is within 107% of the fastest finish time.

Input Format
First line will contain TT, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, two space separated integers XX and YY denoting the fastest finish time and Chef's finish time respectively.*/

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
		int t = in.nextInt();
		for(int i=1;i<=t;i++)
		{
		    int x=in.nextInt();
		    int y=in.nextInt();
		     float limit = x*1.07f;
            if(y<=limit)
                System.out.println("Yes");
            else
                System.out.println("No");
		}
	}
}
