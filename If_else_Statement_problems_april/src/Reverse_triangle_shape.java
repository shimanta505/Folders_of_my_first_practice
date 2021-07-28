import java.util.Scanner;

public class Reverse_triangle_shape {

    /*
              *****
              ****
              ***
              **
              *
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("your length ");
        int length = in.nextInt();

        for(int i = 1;i <= length ;i++){

            for (int k = length ;k >= i;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}