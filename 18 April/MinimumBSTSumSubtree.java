class Solution {
    static int res = (int)1e9;
    
    public static int minSubtreeSumBST(int t, Node root) {
        // code here
        res = (int)1e9;
        solve(t, root);
        return res == (int)1e9 ? -1 : res;
    }
    public static int solve(int t, Node root) {
        if(root == null) return 0;
        int left = solve(t, root.left);
        int right = solve(t, root.right);
        int currSize = 0;
        if(left == t){
            currSize = size(root.left);
            if(currSize < res && isBST(root.left)){
                res = currSize;
            }
        }
        if(right == t){
            currSize = size(root.right);
            if(currSize < res && isBST(root.right)){
                res = currSize;
            }
        }
        
        if(left+right+root.data== t){
            currSize = size(root);
            if(currSize < res && isBST(root)){
                res = currSize;
            }
        }
        return left+right+root.data;
    }
    static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    
    static boolean isBST(Node root){
        if(root == null) return true;
        boolean left = isBST(root.left);
        boolean right = isBST(root.right);
        if(findMax(root.left) < root.data && root.data<findMin(root.right)) return left && right;
        return false;
    }
    static int findMin(Node root){
        if(root == null) return (int)1e9;
        int left = findMin(root.left);
        int right = findMin(root.right);
        return Math.min(root.data, Math.min(left, right));
    }
    static int findMax(Node root){
        if(root == null) return -(int)1e9;
        int left = findMax(root.left);
        int right = findMax(root.right);
        return Math.max(root.data, Math.max(left, right));
    }
}
