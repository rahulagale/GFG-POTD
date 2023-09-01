class Tree
{
    static class Pair{
        Node node;
        int level;
        Pair(Node node,int e){
            this.node = node;
            this.level = e;
        }
    }
    public static void printCorner(Node node)
    {
        Queue<Pair> q = new LinkedList<>();
        Queue<Pair> ans = new LinkedList<>();
        q.add(new Pair(node,0));
        while(!q.isEmpty()){
            Pair curr = q.poll();
            Node temp = curr.node;
            int lvl = curr.level;
            ans.add(curr);
            if(temp.left!=null){
                q.add(new Pair(temp.left,lvl+1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right,lvl+1));
            }
        }
        LinkedHashSet<Node> list = new LinkedHashSet<>();
        Pair prev = ans.poll();
        list.add(prev.node);
        while(!ans.isEmpty()){
            Pair curr = ans.poll();
            int level = curr.level;
            int prevLevel = prev.level;
            if(level!=prevLevel){
                list.add(prev.node);
                list.add(curr.node);
            }
            prev = curr;
        }
        list.add(prev.node);
        for(Node a : list){
            System.out.print(a.data + " ");
        }
        //System.out.println(list);
        // add your code here  
    }
}
