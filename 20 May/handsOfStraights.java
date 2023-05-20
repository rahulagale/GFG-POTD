class Solution {
    static boolean isStraightHand(int N, int groupSize, int hand[]) {
        // code here
        if(hand.length % groupSize != 0) 
            return false;
    
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        
        for (int values : hand){
            pq.add(values);
        }
        
        while(!pq.isEmpty()){
            int smallest = pq.poll();
            for(int i =1;i<groupSize;i++){
                if(pq.remove(smallest+i)) continue;
                
                else 
                    return false;
            }
        }
        return true;
    }
}
