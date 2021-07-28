import java.util.Arrays;

public class Array2D {
    public static void main(String[]args){


        int[] my_array1 = {
          550,560,324,543,567,543,765,4346,3355,334,22234,23,2333,224444,2233334,22343344,34434


        };


        String[] my_array2 = {
                "shimanta",
                "sarker",
                "two",
                "one",
        };


        System.out.println("original array;; "+ Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("sort array:: "+Arrays.toString(my_array1) );
        System.out.println("original list "+Arrays.toString(my_array2));
        System.out.println("sort string "+Arrays.toString(my_array2));


    }
}
