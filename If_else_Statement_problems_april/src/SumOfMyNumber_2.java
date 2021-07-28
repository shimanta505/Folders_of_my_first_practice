import java.util.Scanner;

public class SumOfMyNumber_2 {
    //takes a number and returns the sum of all the numbers from zero to that number.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("your sum number :: ");
        int sum = in.nextInt();
        int equation =0;

        for (int i =sum;i >= 0;i--){
            equation+=i;
        }

        System.out.println(equation);
    }
}
