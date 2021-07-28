import java.util.Scanner;
public class Solution_8 {
    //vowel or consonant
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your character");
        char first = in.next().charAt(0);
        if (first == 'a' || first == 'A' ){
            System.out.println("this is a vowel");
        }else if (first == 'e' || first == 'E'){
            System.out.println("this is a vowel");
        }else if (first == 'i' || first =='I' ){
            System.out.println("this is a vowel");
        }else if(first == 'o' || first =='O'){
            System.out.println("this is a vowel");
        }else if (first == 'u' || first == 'U'){
            System.out.println("this is a vowel");
        }else{
            System.out.println("this is a consonant");
        }
    }
}







