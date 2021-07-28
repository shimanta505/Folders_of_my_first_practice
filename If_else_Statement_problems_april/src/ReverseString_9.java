import java.util.Scanner;

public class ReverseString_9 {
    public static void main(String[] args) {
     /*   Scanner in = new Scanner(System.in);
        System.out.println("enter your String ");
        String name =in.nextLine();

      */
        String name ="shimanta";
        System.out.println(name.length());

        for (int i =name.length()-1;i >=0;i--){
            System.out.print(name.charAt(i));
        }





    }
}
