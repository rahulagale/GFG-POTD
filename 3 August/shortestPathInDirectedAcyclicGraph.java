class Pair{
    int node;
    int dis;
    Pair(int node, int dis){
        this.node = node;
        this.dis = dis;
    }
}
//User function Template for Java
class Solution {
 
public int[] shortestPath(int N,int M, int[][] edges) {
ArrayList<ArrayList<int [] >> adj = new ArrayList<>();
for(int i=0; i<N; i++){
    adj.add(new ArrayList<>());
}
for(int i=0; i<edges.length; i++){
    int sr = edges[i][0];
    int [] ar = { edges[i][1], edges[i][2] };
    adj.get(sr).add(ar);
}
int [] dis = new int[N];
for(int i=1; i<N; i++) dis[i] = (int)1e9; // initializing a every distance infinity and igonre 0 or source node 
 
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(0, 0)); // adding a source node zero with distance zero 
    
while(!queue.isEmpty()){
    Pair p = queue.remove();
    int src = p.node;
    for(int []  NODE : adj.get(src)){
        // node connecting to the source node with the distance 
        int destiny = NODE[0];
        int distance = NODE[1];
        if(dis[destiny] > distance + p.dis){
            queue.add(new Pair(destiny, distance + p.dis ));
            dis[destiny] = distance + p.dis;
        }
        
    }
}
for(int i=0; i<N; i++){
    if(dis[i] == (int)1e9) dis[i] = -1; 
}
return dis;
  }
}
