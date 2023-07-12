class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        long M=(long) Math.pow(10, 9) + 7;
        long ans=0;
        if(R==0){
            return 1;
        }
        if(N==0){
            return 0;
        }
        
        if(R%2==0){
            ans= power(N,R/2);
            return ans%M * ans%M ;
        }
        else
            ans=power(N, (R-1)/2);
            return ((ans%M *ans%M)*N%M)%M;
        
    }

}
