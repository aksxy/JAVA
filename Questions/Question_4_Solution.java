
//4.Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;

class Question_4_Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "is a even number!");
        } else {
            System.out.println(num + "is a odd number!");
        }

    }
}