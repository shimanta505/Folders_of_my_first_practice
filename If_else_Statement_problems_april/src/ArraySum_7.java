import java.util.Scanner;

public class ArraySum_7 {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        int sum = 0;

        for(int i =0;i <= arr.length;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
