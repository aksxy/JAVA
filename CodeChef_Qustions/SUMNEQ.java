/* package codechef; // don't place package name! 

Problem
Alice has a positive integer NN. She is wondering how many ordered pairs of positive integers (i, j)(i,j) exist such that i + j = Ni+j=N.

Help Alice figure out the answer.

Note that since the pairs are ordered, (1, 2)(1,2) and (2, 1)(2,1) are considered different.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 1){
		   System.out.println("0");
		   return;
		}
		int count = 0;
        int numdv = N/2;
     
    	if(N%2 == 0){
    	     count = (numdv-1)*2;
    	    System.out.println(count+1);
    	}
    	else{
    	     count = (numdv)*2;
    	    System.out.println(count);
    	    
    	}
	}
}
