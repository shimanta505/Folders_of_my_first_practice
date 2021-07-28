import java.util.Scanner;
public class Solution_18 {
    //Write a C program to calculate profit or loss.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your buying price :: ");
        int buy = in.nextInt();
        System.out.print("enter your selling price :: ");
        int sell = in.nextInt();

        if (sell > buy){
            System.out.println("your profit is "+ (sell - buy));
        }else if (buy > sell){
            System.out.println("your loss is "+(buy - sell));
        }else{
            System.out.println("you have no profit or loss");
        }
















  }
}