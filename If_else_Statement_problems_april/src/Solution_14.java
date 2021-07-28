import java.util.Scanner;
public class Solution_14 {
    //Write a C program to input angles of a triangle and check whether triangle is valid or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("your first angel");
        int first =in.nextInt();
        System.out.println("your second angel");
        int second = in.nextInt();
        System.out.println("your third angel");
        int third = in.nextInt();

        double a = 0;

        double b = 0;

        double c = 0;

        if (first > 0 && first < 178 ){
            a = first;
        }
        if (second > 0 && second < 178){
            b = second;
        }
        if (third > 0 && third < 178){
            c = third;
        }


        if (a + b + c == 180){
            System.out.println("triangle is valid ");
        }else{
            System.out.println("triangle isn't valid ");
        }
























    }
}

