/* package codechef; // don't place package name! 

Problem
Chef has NN empty bottles where each bottle has a capacity of XX litres.
There is a water tank in Chefland having KK litres of water. Chef wants to fill the empty bottles using the water in the tank.

Assuming that Chef does not spill any water while filling the bottles, find out the maximum number of bottles Chef can fill completely.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers N, X,N,X, and KK.*/

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
		for(int i=1; i<=T;i++)
		{
		    int N = in.nextInt();//total bottels
		    int X = in.nextInt();//one bottel water litter
		    int K = in.nextInt();//total water in litter
		    int max=K/X;
            if(max < N)
            System.out.println(max);
            else if(max > N)
            System.out.println(N);
		   
		}
	}
}
