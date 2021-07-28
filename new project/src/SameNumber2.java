public class SameNumber2 {
    public static void main(String[]args){
        int[] number ={1,2,3,4,1,2,3,4,5};
        for (int i =0;i <number.length;i++){

            for (int l = i + 1;l < number.length;l++){

                if (number[i] == number[l]){
                    System.out.println(number[i]);

                }


            }



        }
    }
}
