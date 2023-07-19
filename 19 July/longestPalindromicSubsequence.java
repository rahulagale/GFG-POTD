class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        int n = S.length();
        int[][] dp = new int[n][n];

        // All substrings of length 1 are palindromic of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Check all substrings of length 2
        for (int i = 0; i < n - 1; i++) {
            if (S.charAt(i) == S.charAt(i + 1)) {
                dp[i][i + 1] = 2;
            } else {
                dp[i][i + 1] = 1;
            }
        }

        // Check for substrings of length 3 and more
        for (int sub_len = 3; sub_len <= n; sub_len++) {
            for (int i = 0; i < n - sub_len + 1; i++) {
                int j = i + sub_len - 1;
                if (S.charAt(i) == S.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i + 1][j]);
                }
            }
        }

        // The longest palindromic subsequence for the entire string is stored at dp[0][n - 1]
        return dp[0][n - 1];
    }
}
