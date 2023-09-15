class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return 0;
        }

        int targetSum = sum / 2;

        boolean[][] dp = new boolean[N + 1][targetSum + 1];

        for (int i = 0; i <= N; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= targetSum; j++) {
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[N][targetSum] ? 1 : 0;
    }
}
