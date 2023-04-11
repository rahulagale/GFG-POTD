class Solution {
    int solve(int a, int b, int c) {
        // code here
        int mx = Math.max(a,Math.max(b,c));
        return mx<=2*(a+b+c-mx+1)?a+b+c:-1;
    }
};
