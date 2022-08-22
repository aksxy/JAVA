
//1.Input a year and find whether it is a leap year or not.
import java.util.*;

public class Question_1_Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year!");
        } else {
            System.out.println(year + " is not a leap year!");
        }
    }
}
/*
 * We generally assume that if a year number is evenly divisible by 4 is a leap
 * year. But it is not the only case. A year is a leap year if −
 * 
 * 1. It is evenly divisible by 100
 * 2. If it is divisible by 100, then it should also be divisible by 400
 * 3. Except this, all other years evenly divisible by 4 are leap years.
 */