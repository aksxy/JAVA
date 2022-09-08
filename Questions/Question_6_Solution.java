import java.util.Scanner;

//6.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class Question_6_Solution {
    public static void main(String args[]) {
        // float p, r, t, si; // principal amount, rate, time and simple interest
        // respectively
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principal amount : ");
        float p = in.nextFloat();
        System.out.print("Enter Rate : ");
        float r = in.nextFloat();
        System.out.print("Enter Time : ");
        float t = in.nextFloat();
        float si;
        si = (p * r * t) / 100;
        System.out.println("Simple interest is : " + si);

    }

}
/*
 * Simple Interest is the convenient method used in banking and economic sectors
 * to calculate the interest charges on loans.
 * It gets estimated day to day with the help of some mathematical terms.
 * 
 * #Formula
 * Simple Interest = (P × R × T)/100
 * where P = Principal Amount, R = Rate per Annum, T = Time (years)
 */