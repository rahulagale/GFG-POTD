class Solution {
    public static int solve(int N, int[] p) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < N; i++){
            if(p[i] > 0)
                set.add(p[i]);
        }
        
        return set.size();
    }
}
