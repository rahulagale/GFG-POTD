class Solution
{
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        ArrayList<Integer> ancestors = new ArrayList<>();
        boolean foundNode = findKthAncestor(root, k, node, ancestors);
        
        // If the node was found and there are enough ancestors, return the kth ancestor
        if (foundNode && k <= ancestors.size()) {
            return ancestors.get(k - 1);
        }
        
        // If node not found or k is greater than the number of ancestors, return -1
        return -1;
    }
    
    // Helper function to find the kth ancestor of a node
    private boolean findKthAncestor(Node root, int k, int node, ArrayList<Integer> ancestors) {
        if (root == null) {
            return false;
        }
        
        // If the current node is the target node
        if (root.data == node) {
            return true;
        }
        
        // Recur for the left and right subtrees
        if (findKthAncestor(root.left, k, node, ancestors) || findKthAncestor(root.right, k, node, ancestors)) {
            // Add the current node as an ancestor
            ancestors.add(root.data);
            
            // If k ancestors are found, no need to continue
            if (ancestors.size() == k) {
                return true;
            }
            
            // Continue searching in other branches
            return true;
        }
        
        // If the current node is not an ancestor, return false
        return false;
    }
}
