
//5.Take name as input and print a greeting message for that particular name.
import java.util.*;

public class Question_5_Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name : ");
        String name = in.nextLine();
        System.out.println("Welcome " + name + " to your program!");
    }
}
