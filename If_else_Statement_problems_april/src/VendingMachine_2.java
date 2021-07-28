import java.util.Scanner;

public class VendingMachine_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("money ");
        float money = in.nextFloat();
        System.out.println("price ");
        float price = in.nextFloat();
        float giveAmount =(int)((money - price) * 100);

        int coin1c = 0;
        int coin1$ = 0;
        int coin5c = 0;
        int coin25c = 0;
        int coin10c = 0;
        int coin50c = 0;


        while(giveAmount >= 100){
            giveAmount-=100;
            coin1$+=1;
        }

        while(giveAmount >= 50){
            giveAmount-=50;
            coin50c+=1;
        }
        while(giveAmount >=25){
            giveAmount-=25;
            coin25c+=1;
        }
        while(giveAmount >= 10){
            giveAmount-=10;
            coin10c+=1;
        }
        while(giveAmount >= 5){
            giveAmount-=5;
            coin5c+=1;
        }
        while (giveAmount >= 1){
            giveAmount-=1;
            coin1c+=1;
        }

        System.out.println("coin 1c :: "+coin1c);
        System.out.println("coin 5c :: "+coin5c);
        System.out.println("coin 10c :: "+coin10c);
        System.out.println("coin 25c :: "+coin25c);
        System.out.println("coin 50c :: "+coin50c);
        System.out.println("coin 1$ :: "+coin1$);
        System.out.println(giveAmount);



    }

}