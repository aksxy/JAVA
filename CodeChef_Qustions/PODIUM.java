/*Problem
Chef got his dream seat in F1 and secured a 3^{rd}3 
rd
  place in his debut race. He now wants to know the time gap between him and the winner of the race.

You are his chief engineer and you only know the time gap between Chef and the runner up of the race, given as AA seconds, and the time gap between the runner up and the winner of the race, given as BB seconds.

Please calculate and inform Chef about the time gap between him and the winner of the race.*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int a,b,t=in.nextInt();
		while(t-->0)
		{
		    a=in.nextInt();
		    b=in.nextInt();
		    System.out.println(a+b);
		}
	}
}
