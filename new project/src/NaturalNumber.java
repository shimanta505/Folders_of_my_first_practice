import java.util.Scanner;
public class NaturalNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int myname;
        System.out.println("type your number ");

        myname = number.nextInt();

        int sum = 0;

        for (int i = 0;i <= myname;i++){

            sum +=i;






        }

        System.out.println(sum);


    }
}