class Solution {
    public static int getMaximum(int N, int[] arr) {
        // code here
        long total=0;
        
        for(int i=0; i<N; i++){
            total+=(long)arr[i];
        }
        
        for(int i=N; i>0; i--){
            if(total % (long)i == 0) return i;
        }
        
        return 1;
    }
}
 
