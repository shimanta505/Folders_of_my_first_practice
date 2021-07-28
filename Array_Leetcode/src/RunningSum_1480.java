
public class RunningSum_1480 {
    public static void main(String[] args) {


        int[]arr ={1,2,3,4};
        int[]runningArray =new int[arr.length];

        int result =0;



        for(int i =0;i<arr.length;i++){

            result=result + arr[i];
            runningArray[i]=result;
        }

        for (int i =0;i<runningArray.length;i++){
            System.out.println(runningArray[i]);
        }
    }
}
