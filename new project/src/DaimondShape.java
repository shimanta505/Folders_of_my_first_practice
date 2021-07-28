public class DaimondShape {
    public static void main(String[]args){
        int[] numbers ={7,11,27,16,15,30,2,13};
        int target = 9;

        boolean noNumber = false;
        for (int i = 0;i < numbers.length;i++){

            for (int j = i +1;j < numbers.length;j++){

                int sum = numbers[i]+numbers[j];

                if (sum == target){
                    System.out.println(sum);
                    noNumber = true;
                }
            }





        }
    if (noNumber){

    }
    else {
        System.out.println("wrong number ");
    }
    }
}




