class Solution
{
    public long[] smallerSum(int n,int arr[])
    {
        long sum=0;
        int[] temp=arr.clone();
         Arrays.sort(arr);
        long[] b=new long[n];
        Map<Integer,Long> map=new HashMap<Integer,Long>(); 
        for(int i=0;i<n;i++)
        {
         
          if(!map.containsKey(arr[i]))
          {
              map.put(arr[i],sum);
          }
          sum+=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            b[i]=map.get(temp[i]);
        }
            
        return b;
    }
}
