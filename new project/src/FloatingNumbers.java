import java.util.Scanner;
public class FloatingNumbers {
    public static void main(String[]args){
        Scanner me = new Scanner(System.in);
        System.out.println("import floating point number");
        double x = me.nextDouble();
        System.out.println("import floating point another number");
        double y = me.nextDouble();

        x = Math.round( x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;
        if (x==y){
            System.out.println("they are same up to next 3 digits"); }

        else {
            System.out.println("they are differents");
        }
    }

}
