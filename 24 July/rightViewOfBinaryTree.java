class Solution{
    //Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node node) {
        //add code here.
        Queue<Node> q = new LinkedList<>();
        ArrayList<Integer> l = new ArrayList<>();
        q.add(node);
        int c = 0;
        q.add(null);
        while(!q.isEmpty()){
            Node t = q.poll();
            if(t==null){
                if(q.isEmpty()){
                    break;
                }
                l.add(c);
                q.add(null);
                continue;
            }
            c = t.data;
        //    System.out.print(t.data);
            if(t.left!=null){
                q.add(t.left);
            }
            if(t.right!=null) {
                q.add(t.right);
            }
        }
        l.add(c);
        return l;
    }
}

