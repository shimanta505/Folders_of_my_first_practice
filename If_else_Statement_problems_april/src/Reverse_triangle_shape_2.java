import java.util.Scanner;
/*
          *****
           ****
            ***
             **
              *
             **
            ***
           ****
          *****

 */
public class Reverse_triangle_shape_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("your length ");
        int length = in.nextInt();

        for (int i = length; i >= 1 ; i --){


            for (int y = length; y >= 1 ; y--){

                if (i >= y){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println(" ");

        }

        for (int i = 2;i <= length;i++){

            for (int k = length ;k >= 1;k--){

                if (i >= k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }

            System.out.println(" ");



        }




    }
}