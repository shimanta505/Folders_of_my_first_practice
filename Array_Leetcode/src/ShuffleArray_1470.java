public class ShuffleArray_1470 {
    public static void main(String[] args) {


        int[][] accounts ={{2,8,7},{7,1,3},{1,9,5}};     //[[2,8,7],[7,1,3],[1,9,5]]

        int wealth =0;
        int count =0;

        for(int i =0;i <accounts.length;i++){

            for(int j = 0;j<accounts.length;j++){


                count=count+accounts[i][j];

            }
            if (count>=wealth){
                wealth=count;
                count=0;
            }
            else {
                count=0;
            }

        }
        System.out.println(wealth);


        }

    }

