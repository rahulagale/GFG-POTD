class Tree
{
    public static float findMedian(Node root)
    {
        // code here.
        ArrayList<Integer>list=new ArrayList<>();
        inorder(root,list);
        int idx;
        float median;
        if(list.size()%2==0){
            idx=(list.size())/2;
            idx--;
            median=(float)((list.get(idx))+(list.get(idx+1)))/2;
        }else{
            idx=(list.size()+1)/2;
            idx--;
            median=list.get(idx);
        }
        return median;
    }
    public static void inorder(Node root,ArrayList<Integer>list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.data);
        inorder(root.right,list);
    }
}
