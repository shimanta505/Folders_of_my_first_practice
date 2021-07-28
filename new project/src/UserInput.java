import java.util.Scanner;
public class UserInput {
    public static void main(String[]args){
        Scanner user = new Scanner(System.in);
        int number;
        System.out.println("enter your number ");
        number = user.nextInt();
        for (int i = 0;i <= number;i++){



            Scanner numbers = new Scanner(System.in);
            int repeat;
            System.out.println("enter your next numbers ");
            repeat = numbers.nextInt();


            System.out.println(repeat);



        }
    }
}
