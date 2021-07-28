public class RotatedArray {
    public static void main(String[] args) {
        int[] a ={};
        int[] k={0,0,0,0,0};

        int input =6;

        int target =input % a.length;
          k = a;
        for (int i = 0; i<target;i++){

            int lastIndex =a[a.length-1];

           /* for (int j = 1;j <a.length;j++){
                a[j] =a[j-1];
                System.out.println(a[j]);
            }

            */
            for (int j =a.length-1;j>0;j--){
                k[j] =a[j-1];
            }
            k[0] =lastIndex;
        }


        for(int l = 0;l <k.length;l++){
            System.out.print(k[l]);
        }
    }
}
