class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        ArrayList<Integer> res = new ArrayList<>();
        
        //queue to store the traversed list
        Queue<Integer> queue = new LinkedList<>();
        
        //add 0 as it is the source node of traversal in the graph
        res.add(0);
        queue.add(0);
        
        //while the queue is not empty
        while(!queue.isEmpty()){
            
            //remove the front element from the queue
            int front = queue.remove();
            
            //run the loop till the size of front'th row in adj arraylist
            for(int j=0; j<adj.get(front).size(); j++){
                
                //if the particular element is no present in the res, then add it in queue and res and continue
                if(!res.contains(adj.get(front).get(j))){
                    queue.add(adj.get(front).get(j));
                    res.add(adj.get(front).get(j));
                }
            }
        }
        
        //return the res
        return res;
    }
}
