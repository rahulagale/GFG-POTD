class Solution
{
    public static int goodSubtrees(Node root,int k)
    {
        int[] ans = new int[1];
        dfs(root, k, new HashSet<>(), ans);
        return ans[0];
    }
    
    private static void dfs(Node root, int k, Set<Integer> p, int[] ans){
        if(root == null) return;
        Set<Integer> curr = new HashSet<>();
        dfs(root.left, k,curr, ans);
        dfs(root.right, k,curr, ans);
        curr.add(root.data);
        if(curr.size() <= k) ans[0]++;
        p.addAll(curr);
    }
}
