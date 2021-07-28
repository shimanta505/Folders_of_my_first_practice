import java.util.Scanner;
public class Solution_6 {
    //leap year
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your number ");
        int first = in.nextInt();

        if (first % 4 == 0){
            System.out.println("this year "+ first+" is leap year");
        }else{
            System.out.println("this year "+ first+" isn't leap year");
        }

    }
}