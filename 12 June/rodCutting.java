class Solution{
    int dp[];
    public int cutRod(int price[], int n) {
        //code here
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n, price);
        
    }
    int solve(int n, int[] price){
        if(dp[n] != -1) return dp[n];
        if(n == 0) return 0;
        int ans = 0;
        for(int i = 0; i<n; i++){
            ans = Math.max(ans , price[i] + solve(n-i-1, price));
        }
        return dp[n] = ans;
    }
}
