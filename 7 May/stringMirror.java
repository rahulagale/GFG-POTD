class Solution {
    public static String stringMirror(String str) {
        // code here
        StringBuilder sb = new StringBuilder();
        char c='\u0000';
        
        for(int i=0;i<str.length();i++){
            if(c=='\u0000' || str.charAt(i)<=c){
               if(str.charAt(i)==c && i==1) break;
               sb.append(str.charAt(i)); 
               c=str.charAt(i);
            } 
            else break;
        }
        return resString(sb);
    }
    
    public static String resString(StringBuilder sb){
        
        StringBuilder sn= new StringBuilder(sb);
        for(int i=sb.length()-1;i>=0;i--) sn.append(sb.charAt(i));
        return sn.toString();
    }
}
