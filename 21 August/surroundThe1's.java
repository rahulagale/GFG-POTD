class Solution
{
    public int  Count(int[][] matrix)
    {
        // code here
        int ans=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int count=0;
                if(matrix[i][j]==1){
                    if(i<matrix.length-1&&matrix[i+1][j]==0) count++;
                    if(i>0&&matrix[i-1][j]==0) count++;
                    if(j<matrix[0].length-1&&matrix[i][j+1]==0) count++;
                    if(j>0&&matrix[i][j-1]==0) count++;
                    
                    if(i<matrix.length-1&&j<matrix[0].length-1){
                        if(matrix[i+1][j+1]==0) count++;
                    }
                    if(i>0&&j>0){
                        if(matrix[i-1][j-1]==0) count++;
                    }
                    if(i>0&&j<matrix[0].length-1){
                        if(matrix[i-1][j+1]==0) count++;
                    }
                    if(i<matrix.length-1&&j>0){
                        if(matrix[i+1][j-1]==0) count++;
                    }
                }
                
                if(count>0&&count%2==0) ans++;
            }
        }
        return ans;
    }
}
