import java.util.*;
import java.util.Scanner;
class Solution{

    public static final int size = 3;
    public static void main(String[]args){

        int alise_score = 0;
        int bob_score = 0;

        Scanner input = new Scanner(System.in);
        int[] alise = new int[size];
        int[] bob = new int[size];

        for (int i = 0;i <size;i++){
            alise[i] = input.nextInt();
        }
        for (int i = 0;i < size;i++){
            bob[i] = input.nextInt();
        }

        for (int i = 0;i < size;i++){
            if (alise[i] > bob[i]){
                alise_score++;
            }
            else if(alise[i] < bob[i]){
                bob_score++;
            }
        }

        System.out.println(alise_score +" "+ bob_score);

    }


}