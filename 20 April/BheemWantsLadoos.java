class Solution{
    static int ladoos(Node root, int home, int k){
        // Your code goes here
        Map<Node,Node> pMap=new HashMap<>();
        fillParentMap(pMap,null,root);
        
        Node targetNode=searchNode(root,home);
        
        return bfsTraversal(new HashSet<>(),pMap,targetNode,k);

    }
    static void fillParentMap(Map<Node,Node> pMap,Node parent,Node root){
        if(root==null){
            return;
        }
        pMap.put(root,parent);
        fillParentMap(pMap,root,root.left);
        fillParentMap(pMap,root,root.right);
    }
    
    static Node searchNode(Node root,int target){
        if(root==null || root.data==target){
            return root;
        }
        Node left=searchNode(root.left,target);
        if(left!=null){
            return left;
        }
        return searchNode(root.right,target);
    }
    
    static int bfsTraversal(Set<Node> vis,Map<Node,Node>pMap,Node root,int k){
        int sum=0;
       
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        vis.add(root);
        
        while(q.size()>0 && k-->=0){
            int size=q.size();
            
            while(size-->0){
                Node curr=q.remove();
                
                Node par=pMap.get(curr);
                Node left=curr.left;
                Node right=curr.right;
                
                sum+=curr.data;
                if(par!=null && vis.contains(par)==false){
                    vis.add(par);
                    q.add(par);
                }
                
                if(left!=null && vis.contains(left)==false){
                    vis.add(left);
                    q.add(left);
                }
                
                if(right!=null && vis.contains(right)==false){
                    vis.add(right);
                    q.add(right);
                }
            }
        }
        
        return sum;
    }
}
