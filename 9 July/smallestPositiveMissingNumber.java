class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        HashSet<Integer> hs=new HashSet<>();
        int maxi=Integer.MIN_VALUE;
        for(int x: arr)
        {
            hs.add(x);
            maxi=Math.max(x,maxi);
        }
        for(int i=1;i<=maxi;i++)
        {
            if(!hs.contains(i))return i;
        }
        return (maxi+1>0)?maxi+1:1;
    }
}
