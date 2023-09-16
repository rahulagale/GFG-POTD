class Solution
{
    //Function to count the number of ways in which frog can reach the top.
    static long countWays(int n)
    {
        // add your code here
         long mod = 1000000007L;
    if (n == 1) {
        return 1L;
    }
    if (n == 2) {
        return 2L;
    }
    if (n == 3) {
        return 4L;
    }

    long a = 1L, b = 2L, c = 4L, d = 0L;
    for (int i = 4; i <= n; i++) {
        d = ((a + b) % mod + c) % mod;
        a = b;
        b = c;
        c = d;
    }
    
    return d;
    }
    
}
