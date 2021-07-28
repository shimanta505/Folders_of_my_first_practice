import java.util.Scanner;
public class LessOrLarge {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Number ");
        double yourNumber = number.nextDouble();

        if (yourNumber == 0) {
            System.out.println("zero");

        }
        else if (yourNumber > 0){
            System.out.println("positive");
        }
        else if (yourNumber < 0){
            System.out.println("negative");
        }
        if (yourNumber < 1) {
            System.out.println("small");

        }
        if (yourNumber > 1000000){
            System.out.println("large");
        }




    }
}