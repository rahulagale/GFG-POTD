class Solution{
     static  ArrayList<Integer> al=new ArrayList<>();
    public int getCount(Node node, int bud)
    {   al.clear();
        Btree(node,1);
        int m=0,sum=0;
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            sum+=al.get(i);
            if(sum<=bud)m++;
            else return m;
        }
        return m;
    }
    public static void Btree(Node node,int h){
         if(node==null)return;
         if(node.left==null && node.right==null)al.add(h);
         Btree(node.left,h+1);
         Btree(node.right,h+1);
    }
}
