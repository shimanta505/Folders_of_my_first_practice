import java.util.Scanner;
public class Solution_20 {
    //Write a C program to input basic salary of an employee and calculate its Gross salary according to following:
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("basic salary :: ");
        int salary = in.nextInt();

        double hra =0;
        double da = 0;
      //  double fullSalary =hra + da+ salary;


        if (salary <= 10000){
             hra = salary * 0.2;
             da = salary * 0.8;
        }else if (salary <= 20000){
            hra = salary * 0.25;
            da = salary * 0.9;

        }else if (salary > 20000){
            hra = salary * 0.3;
            da = salary * 0.95;
        }

        double fullSalary =hra + da+ salary;

        System.out.println("basic salary is "+ salary);
        System.out.println("HRA salary is "+ hra);
        System.out.println("DA salary is "+ da);
        System.out.println("full salary is "+ fullSalary);


    }
}
