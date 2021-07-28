import java.util.Scanner;
public class Solution_7 {
    //character is alphabet or not
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your character ");
        char ch = in.next().charAt(0);

        /*
        boolean b = false;

        for (char c = 'a'; c <= 'z'; c++) {

            if (c == ch) {
                System.out.println("this is a alphabet");
            }

        }

         */

        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
            System.out.println(ch + " is an alphabet.");
        else
            System.out.println(ch + " is not an alphabet.");





    }
}




