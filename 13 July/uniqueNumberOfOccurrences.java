class Solution {
    public static boolean isFrequencyUnique(int n, int[] arr) {
        // code here
        Map<Integer,Integer>mp = new HashMap<>();
        for(int x:arr)
        mp.put(x,mp.getOrDefault(x,0)+1);
        Set<Integer>set = new HashSet<>();
        
        for(int i:mp.keySet()){
            if(!set.contains(mp.get(i)))
            set.add(mp.get(i));
            else
            return false;
        }
        return true;
    }
}
        
