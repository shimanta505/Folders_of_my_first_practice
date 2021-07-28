public class Search_F_and_L_Index{
    public static void main(String[] args) {

        int[] arr ={2,3,3,3,3,3,3,3,3,3,3,3,4,5,6,7,8};

        int i = 0;
        int ii =0;
        int j =arr.length-1;
        int jj =arr.length-1;
        int target =3;
        int firstIndex =0;
        int lastIndex =0;


        while(i <= j){
            int mid =(i + j)/2;

            if (arr[mid]== target){
                j = mid -1;
                firstIndex=mid;
            }
            else if (arr[mid]<target){
                i = mid +1;
            }
        }
        while(ii <= jj){
            {
                int m =(ii + jj)/2;

                if (arr[m]== target){
                    ii = m +1;
                    lastIndex=m;
                }
                else if (arr[m]>target){
                    jj = m - 1;
                }
            }
        }
        System.out.println(lastIndex);



}
}