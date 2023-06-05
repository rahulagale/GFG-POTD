class Solution
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
        int closestElem = (int)1e9;
        while(root!= null){
            if(root.data - K > 0) {
                closestElem= Math.min(closestElem, Math.abs(root.data-K));
                root= root.left;
            }else if(root.data -K<0){
                closestElem= Math.min(closestElem, Math.abs(root.data-K));
                root = root.right;
            }else return 0;
        }
        return closestElem;
    } 
}
