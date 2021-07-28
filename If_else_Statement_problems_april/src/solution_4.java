import java.util.Scanner;
public class solution_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("enter your number ");
        int first = in.nextInt();

        int math1 = first % 5;
        int math2 = first % 11;


        if (math1 == math2){
            System.out.println("number is divisible ");
        }else{
            System.out.println("number isn't divisible ");
        }


    }
}
