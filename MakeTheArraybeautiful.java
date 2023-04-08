class Solution {
    public static ArrayList<Integer> makeBeautiful(int[] arr) {
        // code here
        int n=arr.length;
       Stack<Integer> s=new Stack<>();
       s.push(arr[0]);
       
       for(int i=1; i<n; i++){
           int curr=arr[i];
           
           //check if top is positive
           if(s.size()>0 && s.peek()>=0 && curr < 0){
               s.pop();
           }
           else if(s.size()>0 && s.peek()<0 && curr>=0){
               //top is negative and curr is positive
               s.pop();
           }
           else{
               //same signs
               s.push(curr);
           }
       }
       
       //make res
       ArrayList<Integer> res=new ArrayList();
       
       while(s.size()!=0){
           res.add(0, s.pop());
       }
       
       return res;
    }
}
