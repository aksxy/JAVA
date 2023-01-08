import java.util.*;
import java.io.*;
import java.lang.*;
/*
Problem
The working hours of Chef’s kitchen are from XX pm to YY pm (1 \le X \lt Y \le 12)(1≤X<Y≤12).
Find the number of hours Chef works.
*/
class Codechef
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int X,Y;
        while(t-->0)
        {
            X=in.nextInt();
            Y=in.nextInt();
            System.out.println(Y-X);
        }
    }
}