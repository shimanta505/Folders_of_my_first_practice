public class LargestElementOfArray_12 {
    public static void main(String[] args) {

        int[] arr = {1, 21, 12, 124, 122, 123, 112, 123, 113};

              int max =0;

              for (int i = 0;i <arr.length -1;i++){

                  if (arr[i] > max){
                      max=arr[i];
                  }
              }
        System.out.println(max);


//...

    }
}


