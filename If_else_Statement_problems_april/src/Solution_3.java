import java.util.Scanner;
public class Solution_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your first number :: ");
        int first = in.nextInt();



        if (first > 0){
            System.out.println("positive number ");
        }
        else if (first < 0){
            System.out.println("negative number ");
        }
        else if (first == 0){
            System.out.println("number is 0 ");
        }

    }
}
