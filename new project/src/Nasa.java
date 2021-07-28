import java.util.Scanner;
public class Nasa {
    public static void main(String[]args){
        Scanner first = new Scanner(System.in);
        System.out.println("enter your first attempt");
        byte x = first.nextByte();
        System.out.println("enter your second attempt");
        byte y = first.nextByte();
        System.out.println("YOU HACKED NASA SUCCESFULLY");
    }
}
