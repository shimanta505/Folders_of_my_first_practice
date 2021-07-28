import java.util.Scanner;
public class Solution_5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your number ");
        int first = in.nextInt();


        if (first % 2 == 0){
            System.out.println("your number "+ first+" is even ");
        }else{
            System.out.println("your number "+ first+" is odd ");
        }
    }
}
