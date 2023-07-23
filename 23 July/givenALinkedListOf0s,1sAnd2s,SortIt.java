class Solution
{

    // Function to sort a linked list of 0s, 1s, and 2s.
    static Node segregate(Node head)
    {
        if (head == null || head.next == null)
            return head;
        
        Node zeroHead = new Node(-1); // Dummy node to hold 0s
        Node oneHead = new Node(-1);  // Dummy node to hold 1s
        Node twoHead = new Node(-1);  // Dummy node to hold 2s
        Node zeroTail = zeroHead;
        Node oneTail = oneHead;
        Node twoTail = twoHead;
        
        Node curr = head;
        while (curr != null) {
            if (curr.data == 0) {
                zeroTail.next = curr;
                zeroTail = zeroTail.next;
            } else if (curr.data == 1) {
                oneTail.next = curr;
                oneTail = oneTail.next;
            } else {
                twoTail.next = curr;
                twoTail = twoTail.next;
            }
            curr = curr.next;
        }
        
        // Connect the tails of 0s, 1s, and 2s lists to null.
        zeroTail.next = null;
        oneTail.next = null;
        twoTail.next = null;
        
        // Merge all three lists
        if (zeroHead.next != null) {
            head = zeroHead.next;
            if (oneHead.next != null) {
                zeroTail.next = oneHead.next;
                if (twoHead.next != null) {
                    oneTail.next = twoHead.next;
                }
            } else if (twoHead.next != null) {
                zeroTail.next = twoHead.next;
            }
        } else if (oneHead.next != null) {
            head = oneHead.next;
            if (twoHead.next != null) {
                oneTail.next = twoHead.next;
            }
        } else if (twoHead.next != null) {
            head = twoHead.next;
        }

        return head;
    }
}

