import java.util.Scanner;
public class FactorialNumber {
    public static void main(String[]args){

        Scanner number = new Scanner(System.in);
        int numbers;
        System.out.println("enter your number ");
        numbers = number.nextInt();


        int sum = 1;

        for (int i = 1;i <= numbers;i++){

            sum *= i;
        }
        System.out.println(sum);


    }
}
