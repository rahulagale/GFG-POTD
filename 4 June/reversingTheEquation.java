class Solution
{
   
    String reverseEqn(String S)
    {
        // your code here
        StringBuilder sb=new StringBuilder();
        StringBuilder ans=new StringBuilder();
        for(int i=S.length()-1;i>=0;i--){
           char c=S.charAt(i);
           if(c!='*' && c!='/' && c!='+' && c!='-'){
               sb.append(c);
           }else{
              ans.append(sb.reverse().toString());
              sb.setLength(0);
              ans.append(c);
           }
       }
       ans.append(sb.reverse().toString());
       return ans.toString();
    }
}
