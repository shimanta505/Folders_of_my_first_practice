public class IndexNumberElement_2 {
    public static void main(String[] args) {

        int[] arr1 ={-1,0,3,5,9,12};

        int i = 0;
        int j = arr1.length-1;
        int target = -1;

        while(i <= j){
            int mid = (i + j) / 2;
            int currentNumber =arr1[mid];

            if (currentNumber == target){
                System.out.println("your required number is "+currentNumber);break;

            }
            if(currentNumber > target){
                j = mid - 1;
            }

            if (currentNumber < target){
                i = mid + 1;
            }
        }

    }
}
