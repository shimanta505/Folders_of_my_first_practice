import java.util.Scanner;
public class Solution_21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter your unit :: ");
        int unit = in.nextInt();

        double price = 0;
      //  double totalPrice = price * 1.2;

        if(unit <= 50)
        {
            price = unit * 0.5;
        }
        else if (unit <= 150){
         price = 25 + ((unit - 50) * 0.75);
        }

        else if (unit <= 250){
            price = 100 +((unit - 100) * 1.20);
        }

        else if (unit > 250 ){
            price = 220 +((unit - 250) * 1.50);
        }

        double totalPrice = price * 1.2;
        System.out.println("total bill is "+ totalPrice);


    }

}