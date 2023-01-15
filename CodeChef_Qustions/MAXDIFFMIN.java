/*Problem
Chef is given 33 integers A, B,A,B, and CC such that A \lt B \lt CA<B<C.

Chef needs to find the value of max(A, B, C) - min(A, B, C)max(A,B,C)−min(A,B,C).

Here max(A, B, C)max(A,B,C) denotes the maximum value among A, B, CA,B,C while min(A, B, C)min(A,B,C) denotes the minimum value among A, B, CA,B,C.*/

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
        int A,B,C,t=in.nextInt();
        while(t-->0)
        {
            A = in.nextInt();
            B = in.nextInt();
            C = in.nextInt();// t=in.nextInt();
        if (A >= B && A >= C)
        {
            if (B <= C)
                System.out.println(A - B);
            else
                System.out.println(A - C);
        } 
        else if (B >= A && B >= C)
        {
            if (A <= C)
                System.out.println(B - A);
            else
                System.out.println(B - C);
        } 
        else if (C >= A && C >= B) 
        {
            if (B >= A)
                System.out.println(C - A);
            else
                System.out.println(C - B);
        }

        }
	}
}
