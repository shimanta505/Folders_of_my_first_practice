import java.util.Scanner;

public class FactorialNumber_4 {
    //Write a recursive function that takes a number as an input and returns the factorial of that number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number for factorial :: ");
        int number = in.nextInt();

        int sum =1;

        for (int i = number;i >= 1;i--){
            sum*=i;
        }

        System.out.println(sum);






    }
}
