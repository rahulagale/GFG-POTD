class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> ans = new ArrayList<>();
        
        printAll(S,ans, "");
        
        // sorting ans
        Collections.sort(ans);
        return ans;
    }
    
    public void printAll(String s,List<String> ans, String sAns){
        // removing dublicates and setting Base Case
        if(s.length() == 0 && !ans.contains(sAns)){ 
                ans.add(sAns);
            return;
        }
        
        for(int i = 0; i< s.length();i++){
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            String all = left + right;
            printAll(all,ans,sAns+ ch);
        }
    }
}
