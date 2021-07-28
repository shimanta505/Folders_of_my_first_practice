import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        long what;
        System.out.println(" what is your number ");
        what = number.nextInt();

        long sum = what % 2;
        if (sum == 0 ) {
            System.out.println("your number is positive");
        }
        else if ( sum < 0){
            System.out.println("your number is wrong ");
        }

        else {
            System.out.println("number is negative");
        }


    }
}