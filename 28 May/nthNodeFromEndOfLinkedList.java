class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	// Your code here
    	Node temp = head;
        int size = 0;
        
        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        
        if(n > size)
            return -1;
            
        temp = head;
        
        for(int i = 1; i < size - n + 1; i++)
        {
            temp = temp.next;
        }
        return temp.data;
    }
}
