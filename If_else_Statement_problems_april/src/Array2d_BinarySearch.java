public class Array2d_BinarySearch {
    public static void main(String[] args) {

        int[][] grid = {{4,3,2,-1}, {3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        for (int i = 0;i < grid.length;i++){

            int start =0;
            int end =grid[i].length-1;
            int target = 0;
            while(start <= end){
                int mid = (start + end) / 2;
                int currentNumber =grid[i][mid];

                if (grid[i][mid] < target){
                    System.out.print("expected number is found "+currentNumber+" ");
                    end = mid - 1;
                }
                else if(grid[i][mid] >= target){
                    start = mid + 1;

                }
            }
            System.out.println(" ");
        }
    }
}