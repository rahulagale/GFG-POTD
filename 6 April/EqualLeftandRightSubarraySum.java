class Solution{
	int equalSum(int [] A, int N) {
		//Write your code here
		int sum = 0;
		if(N == 1){
		    return 1;
		}
		for(int i = 0; i<N; i++){
		    sum += A[i];
		}
		int leftSum = 0;
		int rightSum = sum - A[0];
		for(int i = 0; i<N-1; i++){
		    if(leftSum == rightSum){
		        return i+1;
		    }
		    leftSum += A[i];
		    rightSum -= A[i+1];
		}
		return -1;
	}
}
