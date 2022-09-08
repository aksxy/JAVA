/* package codechef; // don't place package name! */
/*
On a certain train, Chef-the ticket collector, collects a fine of Rs. XX if a passenger is travelling without a ticket. It is known that a passenger carries either a single ticket or no ticket.

PP passengers are travelling and they have a total of QQ tickets. Help Chef calculate the total fine collected.

Input Format
The first line contains a single integer TT, the number of test cases. TT lines follow. Each following line contains three integers separated by spaces, whose description follows.

The first integer, XX, is the fee in rupees.
The second integer, PP, is the number of passengers on the train.
The third integer, QQ, is the number of tickets Chef collected.
*/
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		
		for(int i=1;i<=T;i++)
		{
		    int X=in.nextInt();//fees
		    int P=in.nextInt(); //num of passengers without ticket
		    int Q=in.nextInt();//number of ticket collected
		    
		    P = P - Q;
		    int ans = P * X;
		    System.out.println(ans);
		}
	}
}
