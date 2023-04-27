class Solution {
    public static ArrayList<Character> easyTask(int n,String s,int qNo,query queries[])
    {
        ArrayList<Character> ans = new ArrayList<>();
        for(query q : queries)
        {
            if (q.type.equals("1")){
                 s = s.substring(0 , Integer.parseInt(q.a)) + q.b  + s.substring(Integer.parseInt(q.a)+1); 
            }
            else{
                int[] arr = new int[26];
                int left = Integer.parseInt(q.a);
                int right = Integer.parseInt(q.b);
                int k = Integer.parseInt(q.c);
                for(int i=left; i<=right; i++){
                    arr[s.charAt(i)-'a'] += 1;
                }
                for(int i=25; i>=0; i--){
                    k -= arr[i];
                    if(k <= 0){
                        ans.add((char)(i+'a'));
                        break;
                    }
                }
            }
            
        }
        return ans;
    }
}
