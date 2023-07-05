class Solution {
    public static int stockBuyAndSell(int n, int[] prices) {
        // code here
        int maxProfit = 0;
        int buyPrice = prices[0];
        
        for (int i = 1; i < n; i++) {
         if (prices[i] > buyPrice) {
                int profit = prices[i] - buyPrice;
                maxProfit += profit;
            }
            buyPrice = prices[i];
        }  
        return maxProfit;
    }
}
