import java.util.Scanner;
public class Solution_19 {
         //Write a C program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("physics :: ");
        byte physics = in.nextByte();
        System.out.print("chemistry :: ");
        byte chemistry = in.nextByte();
        System.out.print("biology :: ");
        byte biology = in.nextByte();
        System.out.print("math :: ");
        byte math = in.nextByte();
        System.out.print("computer :: ");
        byte computer = in.nextByte();

        int gpa = ((physics + chemistry + biology + math + computer) / 5);
        System.out.println("your avg score "+ gpa);


        if (gpa >= 90){
            System.out.println("Grade A");
        }else if (gpa >= 80){
            System.out.println("Grade B");
        }else if (gpa >= 70){
            System.out.println("Grade C");
        }else if (gpa >= 60){
            System.out.println("Grade D");
        }else if (gpa >= 40){
            System.out.println("Grade E");
        }else if (gpa < 40){
            System.out.println("Grade F");
        }








    }
}
