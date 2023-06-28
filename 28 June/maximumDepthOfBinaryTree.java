class Solution {
  public static int maxDepth(Node root) {
    // code here
    if(root==null) return 0;
      
    return solve(root, 0);

  }
  static int solve(Node root, int d){
      if(root==null) return d;
      
      int l=solve(root.left, d+1);
      int r=solve(root.right, d+1);
      return Math.max(l,r);
  }
}
