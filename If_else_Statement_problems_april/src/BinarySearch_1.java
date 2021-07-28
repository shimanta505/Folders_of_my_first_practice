public class BinarySearch_1 {
    public static void main(String[] args) {
        int[] a ={4,3,2,-1};
        int[] b ={3,2,1,-1};
        int[] c ={1,1,-1,-2};
        int[] d ={1,-1,-1,-2};

        int i =0;
        int j =d.length-1;
        int target =1;

        while(i <= j){
            int mid = (i + j) / 2;
             int currentNumber =d[mid];

            if (d[mid] < target){
                System.out.println("expected number is found "+currentNumber);
                j = mid -1;
            }
           else if(d[mid] >= target){
                i = mid + 1;

            }
        }
    }
}
