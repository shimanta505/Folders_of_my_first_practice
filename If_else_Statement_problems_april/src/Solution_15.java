import java.util.Scanner;
public class Solution_15 {
    // Write a C program to input all sides of a triangle and check whether triangle is valid or not

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("your first angel");
        int a =in.nextInt();
        System.out.println("your second angel");
        int b = in.nextInt();
        System.out.println("your third angel");
        int c = in.nextInt();


        if (a + b > c && b +c >a && a + c > b ) {
            System.out.println("this triangle is valid");
        }else {
            System.out.println("this isn't valid");
        }














    }
}
