import java.util.Scanner;

public class FibonacciSeries_5 {
    //Write a recursive function that takes a number as an input and returns the factorial of that number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number for factorial series :: ");
        int number = in.nextInt();


        int sum =1;
        int sum1 =0;
        int equation = 0;


        for (int i =1;i <=number;i++){

            equation = sum + sum1;
            sum1 =sum;
            sum =equation;

            System.out.println(equation);
        }
    }
}
