import java.util.*;
import java.lang.*;
import java.io.*;
/*
Chef aims to be the richest person in Chefland by his new restaurant franchise. Currently, his assets are worth AA billion dollars and have no liabilities. He aims to increase his assets by XX billion dollars per year.

Also, all the richest people in Chefland are not planning to grow and maintain their current worth.

To be the richest person in Chefland, he needs to be worth at least BB billion dollars. How many years will it take Chef to reach his goal if his value increases by XX billion dollars each year?
*/
class Codechef
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a,b,x;
        while(t-->0)
        {
            a=in.nextInt();
            b=in.nextInt();
            x=in.nextInt();
            System.out.println((b-a)/x);
        }
        
    }
}