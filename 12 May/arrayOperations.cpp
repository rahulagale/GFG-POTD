class Solution {
  public:
    int arrayOperations(int n, vector<int> &arr) {
        // code here
        int count=0;
        int start=0;
        int end=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                end=i;
                if(end-start>0)
                {
                    count++;
                    start=i+1;
                    end=i+1;
                }
                else{
                    start=i+1;
                    end=i+1;
                }
            }
            else{
                end++;
            }
        }
        if(end-start== n) return -1;
        if(end-start>0)
        {
            count++;
        }
      return count;
    }
};
