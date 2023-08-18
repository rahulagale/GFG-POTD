class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<n;i++){
            boolean leader = true;
        
            for(int j=i+1;j<n;j++)
                if(arr[j]>arr[i]){
                    leader = false;
                    break;
                }
                if(leader)result.add(arr[i]);
            }
        
        return result;
    }
}
