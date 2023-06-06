public static void findPreSuc(Node root, int key)
{
    // code here.
    Node curr = root;
       while(curr!=null)
       {
           if(curr.data < key)
           {
               pre = curr;
               curr = curr.right;
           }
           else if(curr.data > key)
           {
               suc = curr;
               curr = curr.left;
           }
           else if(curr.data == key)
           {
                break;
           }
       }
       if(curr!=null)
       {
           if(curr.left!=null)
           {
               pre = curr.left;
               while(pre.right!=null)
               {
                   pre = pre.right;
               }
           }
           if(curr.right!=null)
           {
               suc = curr.right;
               while(suc.left!=null)
               {
                   suc = suc.left;
               }
           }
       }
       return;
     }
}
