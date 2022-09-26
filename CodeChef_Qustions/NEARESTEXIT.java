/* package codechef; // don't place package name! 
Problem
There are two exits in a bus with 100100 seats:

First exit is located beside seat number 11.
Second exit is located beside seat number 100100.
Seats are arranged in a straight line from 11 to 100100 with equal spacing between any 22 adjacent seats.

A passenger prefers to choose the nearest exit while leaving the bus.

Determine the exit taken by passenger sitting on seat XX.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases.
Each test case consists a single integer XX, denoting the seat number.*/

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
		    if(x<=50)
		    System.out.println("LEFT");
		    else
		    System.out.println("RIGHT");
		}
	}
}
