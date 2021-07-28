public class DuplicateNumbers {
    public static void main(String[] args) {
          int[] numbers = {1, 1, 2, 2, 3, 4, 5};
      //  int [] numbers = {1, 1, 2, 2, 3, 4, 5, 1};
        //  int [] numbers = {1,2,3,4,1,2,3,4};



        for (int i = 0; i < numbers.length; i++) {

            for (int c = i + 1; c < numbers.length; c++) {
                if (numbers[i] == numbers[c]) {
                    System.out.println(numbers[i]);
                }


            }

        }

    }
}