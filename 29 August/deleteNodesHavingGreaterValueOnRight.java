class Solution
{
    Node compute(Node head)
    {
        // your code here
        if(head==null || head.next == null)  return head;
        Node ptr = head;
        while(ptr.next != null && ptr != null){
            if(ptr.data < ptr.next.data){
                ptr.data = ptr.next.data;
                ptr.next = ptr.next.next;
                ptr = head;
            }
            else    ptr = ptr.next;
        }
        return head;
    }
}
