import  java.util.Scanner;
public class AddTwoNumberInCondition {
    public static void main(String[]args){

        Scanner number = new Scanner(System.in);
        System.out.println("enter your first number");
        int first = number.nextInt();
        System.out.println("enter your second number ");
        int nextNumber = number.nextInt();

        if ((first > 0) && (nextNumber >0)){

            System.out.println(first + nextNumber);
        }
        else 
    {
            System.out.println("your number is wrong ");
        }



    }
}
