public class MultificationNumber {
    public static void main(String[]args){
        int[] numbers ={1,1,1,2,3,4,5,6,88,90,111,112};

        for (int i = 0;i <numbers.length;i++){

            int number = numbers[i];

            int sum = number % 2;
            if (sum == 0){

                System.out.println(numbers[i]);
            }





        }
    }
}
