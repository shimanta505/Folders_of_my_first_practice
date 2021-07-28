import java.util.Scanner;
public class Solution_2 {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);
        System.out.println("enter your first number :: ");
        int a = in.nextInt();
        System.out.println("enter your second number :: ");
        int b = in.nextInt();
        System.out.println("enter your third number :: ");
        int c = in.nextInt();


        if (a > b && b > c){
            System.out.println(a+" is a maximum number ");
        }
        if (c > b && b > a){
            System.out.println(c+" is a maximum number");
        }
        if (b > a && a > c){
            System.out.println(b+" ia a maximum number ");
        }
     }
}

