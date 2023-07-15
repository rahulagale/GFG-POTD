class Solution
{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        removeAfterK(s, sizeOfStack/2);
    }
    
    private void removeAfterK(Stack<Integer> s, int k) {
        if(k == 0) {
            s.pop();
            return;
        }
        int temp = s.peek();
        s.pop();
        removeAfterK(s, k-1);
        s.push(temp);
    }
}
