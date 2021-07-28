import java.util.Scanner;

public class Pyramid_shape_half {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("your length ");
            int length = in.nextInt();


            for (int i = 1;i <= length;i+=2){

                for (int k = length;k >= 1;k--){

                    if (i >= k){
                        System.out.print(" *");
                    }else {
                        System.out.print(" ");
                    }

                }

                System.out.println(" ");
            }


        }
}




