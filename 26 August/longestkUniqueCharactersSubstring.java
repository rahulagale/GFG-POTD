class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        int low=0;
        int high=0;
        int n=s.length();
        int ans=-1;
        Map<Character,Integer> map=new HashMap<>();
        while(high!=n){
            char ch=s.charAt(high);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                //if map is full reducing the low
                if(map.size()==k){
                    while(map.size()==k){
                        char c=s.charAt(low++);
                        map.put(c,map.get(c)-1);
                        if(map.get(c)==0) map.remove(c);
                    }
                }
                map.put(ch,1);
            }
            if(map.size()==k){
                ans=Math.max(ans,high-low+1);
            }
            
            // System.out.println(" low: "+low+"  high: "+high+"   " +map);
            high+=1;
        }
        return ans;
    }
}
