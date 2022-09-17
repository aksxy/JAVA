/* package codechef; // don't place package name! 

Problem
Chef has decided to join a Gym in ChefLand and if possible, also hire a personal trainer at the gym. The monthly cost of the gym is XX and personal training will cost him an additional YY per month. Chef's total budget per month is only ZZ. Print 1 if Chef can only join the gym, 2 if he can also have a personal trainer, and 0 if he can't even join the gym.

Note that if Chef wants to hire a personal trainer, he must join the gym — he cannot hire the trainer without joining the gym.

Input Format
The first line of input will contain a single integer TT, denoting the number of test cases. Then the test cases follow.
Each test case consists of a single line of input containing three space-separated integers X, Y, ZX,Y,Z.*/

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
		int x,y,z;
		while(t-->0)
		{
		    x=in.nextInt();
		    y=in.nextInt();
		    z=in.nextInt();
		   /* if(x<=z)
		    {
		        if(y<=z && x<=z && (x+y)<=z)
		        System.out.println("2");
		        else if(x<=z && y>=x && (x+y)>=z)
		        System.out.println("1");
		        else if()
		       
		    }
		     else
		        System.out.println("0");*/
		        if(z-(x+y)>=0){
		        System.out.println(2);
		    }
		    else if(z-x>=0 && z-(x+y)<0){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(0);
		    }
		    
		}
	}
}
