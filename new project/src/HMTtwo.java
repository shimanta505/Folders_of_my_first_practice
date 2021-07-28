public class HMTtwo {
    public static void main(String[]args){
        int[] number ={1,2,3,5,6,56,2,2,2,2,2, 2, 2};

        int sum = 0;

        int target = 2;


        for (int i = 0;i <number.length;i++){

            if(number[i] == target) {
                sum += 1;
            }

//            int first = number[i];
//            int second = first / 2;
//            if (second == 1){
//                sum += second;
//            }
        }


        System.out.println(sum);



    }

}
