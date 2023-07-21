class Solution
{
    private static Node reverse(Node head){
        Node prev = null, cur = head, next = null;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            
            cur = next;
        }
        
        return prev;
    }
    
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node head = null, tail = node, prev = null;
        while(tail != null){
            Node temph = tail, tempt = tail;
            int count = k;
            while(count > 1 && tempt.next != null){
                tempt = tempt.next;
                count--;
            }
            tail = tempt.next;
            tempt.next = null;
            
            reverse(temph);
            if(head == null){
                head = tempt;
            }else{
                prev.next = tempt;
            }
            
            prev = temph;
        }
        
        return head;
    }
}
