class Solution {
    static int setBits(int N) {
        // code here
        int count = 0;
        while(N>0){
            int t = N%2;
            if(t==1){
                count+=1;
            }
            N=N/2;
        }
        return count;
    }
}
