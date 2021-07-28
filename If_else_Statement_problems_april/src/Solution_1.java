import java.util.Scanner;
public class Solution_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your first number ");
        int first =in.nextInt();
        System.out.println("enter your second number");
        int second = in.nextInt();


        if (first > second){
            System.out.println("your maximum number is "+ first);
        }
        else{
            System.out.println("your maximum number is "+ second);
        }
    }
}
