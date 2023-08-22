class Solution {
    public static int findMinOperation(int N, int[][] matrix) {
        // code here
        int[] row_sums = new int[N];
        int[] col_sums = new int[N];
        int ans = 0;
        
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                row_sums[i] += matrix[i][j];
                col_sums[j] += matrix[i][j];
            }
        }
        
        //System.out.println(Arrays.toString(row_sums));
        //System.out.println(Arrays.toString(col_sums));
        int raise_to = 0;
        for (int num : row_sums){
            raise_to = Math.max(raise_to,num);
        }
        
        for (int num: col_sums){
            raise_to = Math.max(raise_to,num);
        }
        
        //add diff to and
        for (int num: row_sums){
            ans += raise_to - num;
        }
        
        for (int num: col_sums){
            ans += raise_to - num;
        }
        //a count contributed to a cell in a row, also contibutes to the cell in that coll
        //so we are double counting
        return ans/2;
    }
}
        
