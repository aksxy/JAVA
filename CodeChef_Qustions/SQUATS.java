/* package codechef; // don't place package name!

    Somu went to the gym today. He decided to do XX sets of squats. Each set consists of 1515 squats. Determine the total number of squats that he did today.
*/

import java.util.*;
import java.lang.*;
import java.io.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main(String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int t=in.nextInt();
	    int x;
	    while(t-->0)
	    {
	        x = in.nextInt();
	        System.out.println(x*15);
	    }
	}
}
