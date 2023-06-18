class Solution {
    public static int distributeTicket(int N,int K)
    {
        Deque<Integer>dq = new ArrayDeque();
        for(int i=1;i<=N;i++) dq.add(i);
        int ans = 0,ind = K;
        while(!dq.isEmpty()){
            while(ind!=0 && !dq.isEmpty()){
                ans = dq.pollFirst();
                ind--;
            }
            ind = K;
            while(ind!=0 && !dq.isEmpty()){
                ans = dq.pollLast();
                ind--;
            }
            ind = K;
        }
        return ans;
    }
}
