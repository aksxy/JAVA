import java.util.Scanner;

//3.Take a number as input and print the multiplication table for it.
public class Question_3_Solution {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=in.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num*i);
        }
    }
}
