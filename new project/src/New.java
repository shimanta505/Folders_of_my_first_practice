import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int what;
        System.out.println("enter your number// ");
        what = number.nextInt();
        int i = what % 3;
        int j = what % 5;

            if (i == j) {
                System.out.println("Fizz Buzz");
            }
            if (0 < i && j == 0) {
                System.out.println("Buzz");
            }
            if (j > 0 && i == 0) {
                System.out.println("Fizz");
            }
            if (i > 0 && j > 0){
                System.out.println("Not in bound");
            }




    }
}
