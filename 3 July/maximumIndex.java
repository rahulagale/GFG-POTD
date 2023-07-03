class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        int pre[] = new int[n];
        pre[0] = arr[0];
        for(int i = 1; i<n; i++) pre[i] = Math.min(arr[i] , pre[i-1]);
        int ans = 0;
        
        
        for(int i = 1 ; i<n; i++){
            int l = 0;
            int r = i-1;
            
            while(l<=r){
                int mid =(l+r)>>1;
                if(pre[mid]<=arr[i]) r = mid-1;
                else l = mid+1;
            }
            
            if(l<i) ans = Math.max(ans , i - l );
        }
        return ans;
        
    }
}
