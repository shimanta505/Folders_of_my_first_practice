import java.util.Scanner;
public class BigNumber {
    public static void main(String[] args) {
            Scanner bigNumber = new Scanner(System.in);
            System.out.println("enter your 3 numbers ::");
            int x = bigNumber.nextInt();
            int y = bigNumber.nextInt();
            int z = bigNumber.nextInt();
            if (x > y && y > z){
                System.out.println(x+" is a big number ");
            }
            if (z > y && y > x){
                System.out.println(z+" is a big number");
            }
            if (y > x && x > z){
                System.out.println(y+" ia a big number ");
            }


            // another solution....
            int number = Integer.MIN_VALUE;

            if(x>y) {
                number = x;
            } else {
                number = y;
            }

            if(number>z) {
              System.out.println(number);
            } else {
                System.out.println(z);
            }

            // another solution

            int maxNumber = Math.max(x,y);
            maxNumber = Math.max(z, maxNumber);
            System.out.println(maxNumber);


        }
    }

