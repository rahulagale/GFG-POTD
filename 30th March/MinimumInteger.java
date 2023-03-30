class Solution {
    public static int minimumInteger(int N, int[] A) {
        // code here
        int res=Integer.MAX_VALUE;
        long sum=0;
        for(int i:A){
            sum+=i;
        }
        
        for(long i:A){

            if(i<res&&i*N>=sum){
                res=(int)i;
            }
        }
        if(res*N!=Integer.MAX_VALUE)
        return res;
        
        return -1;
    }
}
