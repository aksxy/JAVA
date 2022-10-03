/* package codechef; // don't place package name! 
Problem
Chef is currently working for a secret research group called NEXTGEN. While the rest of the world is still in search of a way to utilize Helium-3 as a fuel, NEXTGEN scientists have been able to achieve 2 major milestones:

Finding a way to make a nuclear reactor that will be able to utilize Helium-3 as a fuel
Obtaining every bit of Helium-3 from the moon's surface
Moving forward, the project requires some government funding for completion, which comes under one condition: to prove its worth, the project should power Chefland by generating at least AA units of power each year for the next BB years.

Help Chef determine whether the group will get funded assuming that the moon has XX grams of Helium-3 and 11 gram of Helium-3 can provide YY units of power.*/

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
		int t=in.nextInt();
		int a,b,x,y;
		while(t-->0)
		{
		    a=in.nextInt();
		    b=in.nextInt();
		    x=in.nextInt();
		    y=in.nextInt();
		    if((x*y)/a>=b)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		}
	}
}
