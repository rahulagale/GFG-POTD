class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer>ans=new ArrayList<>();
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        boolean flag=false;
        while(!q.isEmpty()){
            int level=q.size();
            ArrayList<Integer>arr=new ArrayList<>();
            for(int i=0;i<level;i++){
                Node curr=q.remove();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                arr.add(curr.data);
            }
            if(flag){
                ans.addAll(arr);
            }
            else{
                Collections.reverse(arr);
                ans.addAll(arr);
            }
            flag=!flag;
        }
        return ans;
    }
}
