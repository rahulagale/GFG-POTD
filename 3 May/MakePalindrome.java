class Solution {
    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<n; i++){
            StringBuffer sb = new StringBuffer(arr[i]);
            String s = sb.toString();
            String rev = sb.reverse().toString();
            
           if(map.containsKey(s)){
                map.remove(s);
            }
            else if(map.containsKey(rev)){
                map.remove(rev);
            }
            else{
                map.put(s, 1);
            }
        }
        
        //check map
        
        if(map.size() == 0){
            return true;
        }
        else if(map.size()==1){
            for(String val : map.keySet()){
                StringBuffer sb=new StringBuffer(val);
                
                if(val.equals(sb.reverse().toString())){
                    return true;
                }
            }
        }
        
        return false;
    }
}
