import java.util.Arrays;

public class mini_max_sum {
    public  static void main (String[]args){

        int sum =0;
        int [] arr = {1,2,3,4,5};

       // int sum = 0;
        int min =0;
        int max =0;

        for (int i = 1;i < arr.length;i++){
            sum = sum + i;
            if (arr[i]< arr[0]){
                 min = arr[i];
            }
            if (arr[i]> arr[0]){
                 max = arr[i];
            }



        }

        System.out.println((sum = max)+" "+(sum - min));

        System.out.println(sum);




    }
}
