class Solution {
    static int sumOfNaturals(int n) {
        // code here
        int s=0;
        for(int i=1;i<=n;i++){
            s=s+i;
            if (s>1000000007)
                s=s%1000000007;
        }
        
        return s;
    }
};
