class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int[] dp = new int[y + 1];
        for(int i = 0; i < s1.length(); ++i){
            int[] temp = new int[y + 1];
            for(int j = 0; j < s2.length(); ++j){
                if(s1.charAt(i) == s2.charAt(j)){
                    temp[j + 1] = dp[j] + 1;
                }else{
                    temp[j + 1] = Math.max(temp[j], dp[j + 1]);
                }
            }
            
            dp = temp;
        }
        return dp[y];
    }
    
}
