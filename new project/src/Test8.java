import java.util.Scanner;
public class Test8 {
        public static void main(String[]args){

            Scanner myresult = new Scanner(System.in);
            byte userName;
            System.out.println("what is your number:: ");
            userName = myresult.nextByte();

            if (userName < 33){
                System.out.println("you are failed");
            } else if (userName < 40){
                System.out.println("your result is D ");
            } else if (userName < 50){
                System.out.println("ypur result is C ");
            } else if (userName < 60){
                System.out.println("your result is B ");
            } else if (userName < 70){
                System.out.println("your result is A- ");
            } else if (userName < 80){
                System.out.println("your result is A ");
            } else if (userName <= 100 ){
                System.out.println("your got A+ ");
            } else if (userName >=100) {
                System.out.println("your number is incorrect//");
            }

        }

}
