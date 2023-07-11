class Solution
{
    /*You are required to complete this method*/
    int findK(int A[][], int n, int m, int k)
    {
	// Your code here
	    int count =0;
       int top = 0, bottom = n-1, left = 0, right = m-1;
       while (top <= bottom && left <= right) {
           for (int i =left; i<=right; i++) {
               count++;
               if(count ==k)
               return A[top][i];
           }
           top++;
           for(int i=top; i<=bottom; i++) 
           {
               {
                   count++;
                   if(count==k) return A[i][right];
               }
           }
           right--;
           if(top<=bottom) {
               for(int i = right; i>=left; i--) {
                   count++;
                   if(count == k) return A[bottom][i];
               }
               bottom--;
           }
           if(left <=right) {
               for (int i= bottom; i>=top; i--) {
                   count++;
                   if(count==k) return A[i][left];
               }
               left++;
           }
       }
       return 0;
    }
}
