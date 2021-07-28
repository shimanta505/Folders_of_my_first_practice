import java.util.Scanner;
public class Solution_16 {
    //Write a C program to check whether the triangle is equilateral, isosceles or scalene triangle.
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.println("your first angel");
        int a =in.nextInt();
        System.out.println("your second angel");
        int b = in.nextInt();
        System.out.println("your third angel");
        int c = in.nextInt();

        if (a == b && b == c ){
            System.out.println("equilateral triangle");
        }else if (a == b || b == c || c == a){
            System.out.println("isosceles triangle");
        }else {
            System.out.println("scalene");
        }
















    }
}
