class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        int i=2;
        while(i<N){
            if(N%i==0)  N/=i;
            else i++;
        }
        return (long)N;
    }
}
