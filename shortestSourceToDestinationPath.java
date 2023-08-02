class Solution {
    public static final int UNREACHABLE = -1;
    public static final int DIRECTIONS = 4;
    public static final int dirX[] = {-1,1,0,0};
    public static final int dirY[] = {0,0,-1,1};
    class Cell{
        int x,y,distance;
        Cell(int x,int y,int distance){
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
    int shortestDistance(int N, int M, int A[][], int X, int Y) {
        // code here
        if(A[0][0] == 0){
            return UNREACHABLE;
        }
        Queue<Cell> queue = new LinkedList<>();
        boolean[][] visited = new boolean[N][M];
        int startX = 0,startY = 0,destX = X,destY = Y;
        queue.add(new Cell(startX,startY,0));
        visited[startX][startY] = true;
        while(!queue.isEmpty()){
            Cell cur = queue.poll();
            if(cur.x == destX && cur.y == destY){
                return cur.distance;
            }
            for(int direction = 0; direction < DIRECTIONS; direction++){
               int nextX = cur.x + dirX[direction];
               int nextY = cur.y + dirY[direction];
               if(isSafe(nextX,nextY,N,M) && A[nextX][nextY] == 1 && !visited[nextX][nextY]){
                   queue.add(new Cell(nextX,nextY,cur.distance+1));
                   visited[nextX][nextY] = true;
               }
            }
        }
        return UNREACHABLE;
    }
    private boolean isSafe(int x,int y,int n,int m){
        return x >= 0 && x < n && y >= 0 && y < m;
    }
};
