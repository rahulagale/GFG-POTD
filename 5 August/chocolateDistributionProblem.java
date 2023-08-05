class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long ans = Long.MAX_VALUE;
        for(int i=0; i<=n-m; i++){
            long diff= a.get(m+i-1) - a.get(i);
            ans = Math.min(ans,diff);
        }
        return ans;
    }
}
