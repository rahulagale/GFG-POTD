class Solution {
    public static int totalCuts(int N, int K, int[] A) {
        // code here
        int[] mini=new int[N];
        int[] maxi=new int[N];
        maxi[0]=A[0];
        mini[N-1]=A[N-1];
        for(int i=1;i<N-1;i++){
            mini[N-i-1]=Math.min(mini[N-i],A[N-i-1]);
            maxi[i]=Math.max(maxi[i-1],A[i]);
        }
        int ans=0;
        for(int i=0;i<N-1;i++){
            if(mini[i+1]+maxi[i] >=K)ans++;
        }
        return ans;
    }
}
    
