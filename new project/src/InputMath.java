import java.util.Scanner;
public class InputMath {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("input number:: ");
        int your_input = input.nextInt();

        System.out.println("enter your number one by one::  ");
        int prevNumber = Integer.MIN_VALUE;
        for (int i =0 ;i < your_input;i++){

            int number = input.nextInt();

            if(prevNumber != number) {
                System.out.println(number);
                prevNumber = number;
            }







          //  int array = number;









        }



    }
}
