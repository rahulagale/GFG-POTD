class Solution 
{ 
    boolean wifiRange(int N, String S, int X) 
    { 
        // code here
        int count  = 0;
       int temp = 0;
       for(int i=0;i<N;i++){
           if(S.charAt(i)=='0'){
               count++;
           }else{
               if(temp==0 && count>X){
                   return false;
               }else{
                   temp = 1;
               }
               if(count> X*2)
               return false;
               count=0;
           }
               
           }
           if(count<=X)
            return true;
            else
            return false;
    }
} 
