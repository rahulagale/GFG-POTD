class Solution
{
    public int closedIslands(int[][] matrix, int n, int m)
    {
        // Code here
        int count = 0;
        boolean[][] visited = new boolean[n][m];
        
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                if( !visited[i][j] && matrix[i][j]==1 && DFS(i,j,matrix,visited,n,m) )
                    count++;

        return count;
    }
    boolean DFS(int i,int j,int[][] matrix,boolean[][] visited,int n,int m){
        
        // Base condition 
        if(i>=n-1 || i==0 || j>=m-1 || j==0)
            return false;
        // mark current visited
        visited[i][j] = true;   
        // flag to check if any island goes to boundary or not
        boolean flag = true;
        // Go up
        if(matrix[i-1][j]==1 && !visited[i-1][j])
            flag &= DFS(i-1,j,matrix,visited,n,m);
        // Go down
        if(matrix[i+1][j]==1 && !visited[i+1][j])
            flag &= DFS(i+1,j,matrix,visited,n,m);
        // Go left
        if(matrix[i][j-1]==1 && !visited[i][j-1])
            flag &= DFS(i,j-1,matrix,visited,n,m);
        // Go right
        if(matrix[i][j+1]==1 && !visited[i][j+1])
            flag &= DFS(i,j+1,matrix,visited,n,m);
        
        // it will return true if none of the island through this not reach boundary
        // else false
        return flag;    
    }
}
