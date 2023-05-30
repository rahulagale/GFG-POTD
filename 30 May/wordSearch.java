class Solution
{
    public boolean isWordExist(char[][] board, String word)
    {
        // Code here
        int len=word.length();
        int n=board.length;
        int m=board[0].length;
        
        int vis[][]=new int[n][m];
        
        boolean[] flag=new boolean[]{false};
        
        int negihbours[][]={{1,0},{-1,0},{0,-1},{0,1}};
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                dfs(0,len,i,j,n,m,vis,board,word,flag,negihbours);
                if(flag[0]==true)return true;   
            }
        }
        return flag[0];
    }
    public void dfs(int idx, int len,int i,int j,int n,int m,int vis[][],char board[][],String word,boolean[] flag,int negihbours[][]){
        if(idx==len){
            flag[0]=true;
            return;
        }
        if(flag[0]==true)
            return;
        if(i==n || j==m)
            return;
        
        if(word.charAt(idx) == board[i][j]){
            vis[i][j]=1;
        
            for(int[] neg:negihbours){
                int ni=i+neg[0];
                int nj=j+neg[1];
            
                if(ni>=0 && ni<n && nj>=0 && nj<m && vis[ni][nj]==0){
                    dfs(idx+1,len,ni,nj,n,m,vis,board,word,flag,negihbours);
                }
            }
        
            vis[i][j]=0;
        }
    }
}
