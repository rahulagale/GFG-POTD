class Solution {
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        int k=-1,frequency=Integer.MAX_VALUE,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.get(arr[i])!=null){
                int value=map.get(arr[i]);
                map.put(arr[i],++value);
            }
            else map.put(arr[i],1); k++; arr[k]=arr[i];
        }
      for(int i=0;i<=k;i++){
          
          if(map.get(arr[i])<frequency){
              max=arr[i];
              frequency=map.get(arr[i]);
          }
          else if(map.get(arr[i])==frequency){
              if(max<arr[i]) max=arr[i];
          }
      }  
      return(max);

    }
}
