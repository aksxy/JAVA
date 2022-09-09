/* package codechef; // don't place package name!

Problem
There is a group of NN friends who wish to enroll in a course together. The course has a maximum capacity of MM students that can register for it. If there are KK other students who have already enrolled in the course, determine if it will still be possible for all the NN friends to do so or not.

Input Format
The first line contains a single integer TT - the number of test cases. Then the test cases follow.
Each test case consists of a single line containing three integers NN, MM and KK - the size of the friend group, the capacity of the course and the number of students already registered for the course.*/

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
		int T = in.nextInt();
		for(int i=1;i<=T;i++)
		{
		    int N = in.nextInt(); //new student 
		    int M = in.nextInt();//course capacity
		    int K = in.nextInt();//allredy enrold 
		    if(M-K >= N)
		    {
		        System.out.println("YES");
		    }
		    else
		    System.out.println("NO");
		    
		}
	}
}
