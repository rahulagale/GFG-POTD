class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
         // Your code here
         Node temp=head;
         Node prev=head;
         HashSet<Integer> h=new HashSet<>();
         while(temp!=null){
             if(h.contains(temp.data)){
                 prev.next=temp.next;
                 temp=prev.next;
             }
             else{
                 h.add(temp.data);
                 prev=temp;
                 temp=temp.next;
             }
         }
         return head;
    }
}
