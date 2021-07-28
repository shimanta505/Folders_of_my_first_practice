import java.util.Scanner;
public class Solution_11 {
    //Write a C program to input week number and print week day.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number 1 to 7");

        byte b = in.nextByte();


        if (b == 1) {
            System.out.println("monday");
        } else if (b == 2) {
            System.out.println("tuesday");
        } else if (b == 3) {
            System.out.println("wednesday");
        } else if (b == 4) {
            System.out.println("thursday");
        } else if (b == 5) {
            System.out.println("friday");
        } else if (b == 6) {
            System.out.println("saturday");
        } else if (b == 7) {
            System.out.println("sunday");
        }


    }

}

