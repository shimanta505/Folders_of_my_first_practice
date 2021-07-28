public class ArrayForLoop {
    public static void main(String[]args){
        int[] numbers ={1,2,3,4,5,6,3,7,8,9,10,11,12,13,14,15,};
        int sum = 0;
        for (int i =0;i < numbers.length;i++ ){
            int number = numbers[i];
            sum += number;
        }
        System.out.println(sum);
    }
}
