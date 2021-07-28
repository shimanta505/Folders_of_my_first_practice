import java.util.Scanner;
public class Solution_10 {
    //Write a C program to check whether a character is uppercase or lowercase alphabet.
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your first character");
        char ch = in.next().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("this is lower case");
        }else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("this is upper case");
        }else{
            System.out.println("your character is wrong");
        }













    }
}
