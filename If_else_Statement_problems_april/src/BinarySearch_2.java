public class BinarySearch_2 {
    public static void main(String[] args) {
        String[] words = {"a","aa","aaa","aaaa","ab"};


        int i =0;
        int j = words.length-1;
        String target = "aaaa";


        while (i <= j){
            int mid =(i + j)/2;
            String currentNumber =words[mid];
            int compare =currentNumber.compareTo(target);
          //  System.out.println(compare);

            if (compare == 0){
                System.out.println(currentNumber);break;
            }
            else if (compare == 1){
                j = mid - 1;
            }
            else if (compare == -1){
                i = mid +1;
            }
        }
    }
}
