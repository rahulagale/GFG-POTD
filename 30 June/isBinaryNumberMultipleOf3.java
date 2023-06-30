class Solution {
    int isDivisible(String s) {
        // code here
        int res=0;
        
        for(char i: s.toCharArray()){
            res*=2;
            res+=(int)(i);
            res%=3;
        }
        
        if(res==0)return 1;
        
        return 0;
    }
}
