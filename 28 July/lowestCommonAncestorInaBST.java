class BST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
        // code here.   
        if (root == null) return null; 
  
        // If both n1 and n2 are smaller than root, then LCA lies in left 
        if (root.data > n1 && root.data > n2) 
            return LCA(root.left, n1, n2); 
      
        // If both n1 and n2 are greater than root, then LCA lies in right 
        if (root.data < n1 && root.data < n2) 
            return LCA(root.right, n1, n2); 
      
        return root; 
    }
    
}
