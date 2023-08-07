class Solution
{
    //Function to find a solved Sudoku. 
    public static final int ROWS = 9;
    public static final int COLS = 9;
    static boolean SolveSudoku(int grid[][])
    {
        return playSudoku(grid,0,0);
    }
    private static boolean playSudoku(int[][] grid,int row,int col){
        if(row == ROWS){
            return true;
        }
        if(col == COLS){
            return playSudoku(grid,row+1,0);
        }
        if(grid[row][col] != 0){
           return playSudoku(grid,row,col+1);
        }
        for(int num = 1; num <= 9; num++){
           if(canPlace(grid,row,col,num)){
               grid[row][col] = num;
               //System.out.println(row+" "+col+" "+grid[row][col]);
               if(playSudoku(grid,row,col+1)){
                   return true;
               }
               else{
                   grid[row][col] = 0;
               }
           }
        }
        return false;
    }
    private static boolean canPlace(int[][] grid,int row,int col,int value){
        //check if the same value exists in the row;
        for(int i = 0; i < COLS; i++){
            if(grid[row][i] == value){
                return false;
            }
        }
        //check if the same value exists in the column
        for(int i = 0; i < ROWS; i++){
            if(grid[i][col] == value){
                return false;
            }
        }
        //check if the same value exists in the grid
        int grid_row = (row/3)*3,grid_col = (col/3)*3;
        for(int r = grid_row ; r < grid_row+3; r++){
            for(int c = grid_col; c < grid_col+3; c++){
                if(grid[r][c] == value){
                    return false;
                }
            }
        }
        return true;
    }
    //Function to print grids of the Sudoku.
    static void printGrid (int grid[][])
    {
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
        }
    }
}
