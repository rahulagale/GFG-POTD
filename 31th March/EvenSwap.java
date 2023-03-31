class Solution{
	int [] lexicographicallyLargest(int [] arr, int n) {
		//Write your code here
		int[] ans = new int[n];
		int k = 0;
		int a = 0;
		
		for(int i=0; i<n; i++){
		    if( arr[a]%2 != arr[i]%2 ){
		        
		        int[] subArr = Arrays.copyOfRange(arr,a,i);
		        Arrays.sort(subArr);
		        for(int j=subArr.length-1; j>=0; j--){
                    ans[k++] = subArr[j];
                }
		        
		        a = i;
		    }
		}
		
		int[] subArr = Arrays.copyOfRange(arr,a,n);
		Arrays.sort(subArr);
        for(int j=subArr.length-1; j>=0; j--){
            ans[k++] = subArr[j];
        }
        
		return ans;
	}
}
