class Solution
{
    public static long totalTime(int n,int arr[],int time[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        long sum=-1;
        
        for(int i=0;i<arr.length;i++){
          if(!list.contains(arr[i])){
              list.add(arr[i]);
              sum++;
             
          }  else{
               sum=sum+ time[arr[i]-1];
          }
        }
        return sum;
    }
}
