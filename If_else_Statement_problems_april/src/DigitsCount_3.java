import java.util.Scanner;

public class DigitsCount_3 {
    //Write a program to count the digits of a given number
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your number");
         int number =in.nextInt();

        int sum =0;

      /*   while(number == 0){
             number/=10;
             sum+=1;
         }

       */



         while (number!= 0){
             number/=10;
             sum+=1;
         }

        System.out.println(sum);

    }
}
