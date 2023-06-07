class Solution
{
    public int[] leastPrimeFactor(int n)
    {
        // code here
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        
        for(int i = 2;i<=n;i++){
            list.add(isPrime(i));
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
    
    public int isPrime(int n){
        for(int i = 2; i<= n/2; i++){
            while(n%i == 0) return i;
        }
        return n;
    }
}
