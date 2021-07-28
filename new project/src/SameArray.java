public class SameArray {
    public static void main(String[]args){

        int[] numbers ={1,2,3,4,1,2,4,3,5};

        for (int i = 0;i <numbers.length ;i++)
        {
            for (int l=i+1;l < numbers.length;l++ )

                if (numbers[i]==numbers[l]){

                    System.out.println(numbers[l]);
            }
        }
    }
}
