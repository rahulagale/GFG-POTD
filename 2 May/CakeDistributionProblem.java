class Solution{
	int maxSweetness(int [] sweetness, int N, int K) {
        // Write your code here.
        int sum=0,end=0,start=0;
        
        for(int item:sweetness)
        {
            sum+=item;
        }
        end=sum/(K+1);
        
       return BinarySearch(start,end,sweetness,K+1);
    }
    int BinarySearch(int start,int end,int[] sweetness,int tar)
    {
        int ans = Integer.MAX_VALUE;
        
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(Valid(mid,sweetness,tar))
            {
               ans=Math.min(ans,mid);
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
            
        }
        return end;
    }
    boolean Valid(int no,int[] sweetness,int tar)
    {
        int temp=0,ctr=0;
        for(int i=0;i<sweetness.length;i++)
        {
            temp+=sweetness[i];
            if(temp>=no)
            {
                ctr++;
                if(ctr>=tar)
                return true;
                temp=0;
            }
        }
        return false;
    }
}
