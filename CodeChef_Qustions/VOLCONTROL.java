/* package codechef; // don't place package name! 

Problem
Chef is watching TV. The current volume of the TV is XX. Pressing the volume up button of the TV remote increases the volume by 11 while pressing the volume down button decreases the volume by 11. Chef wants to change the volume from XX to YY. Find the minimum number of button presses required to do so.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
The first and only line of each test case contains two integers XX and YY - the initial volume and final volume of the TV.*/

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
		for(int i=1;i<=T;i++)
		{
		    int X = in.nextInt();
		    int Y = in.nextInt();
		    if(X>=Y)
		    {
		        System.out.println(X-Y);
		    }
		    else{
		        if(X<=Y)
		        {
		            System.out.println(Y-X);
		        }
		    }
		}
	}
}
