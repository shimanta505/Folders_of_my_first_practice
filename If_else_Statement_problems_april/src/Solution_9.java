import java.util.Scanner;
public class Solution_9 {
    //    Write a C program to check whether it is alphabet, digit or special character.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your character");
        char ch = in.next().charAt(0);


        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        }
        else if (ch >= '0' && ch <='9'){
            System.out.println("this is a number");
        }
        else  {
            System.out.println("this is a special character");
        }
    }
}
