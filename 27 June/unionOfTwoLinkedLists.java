class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    ArrayList<Integer> al=new ArrayList<>();
	    Node temp1=head1;
	    Node temp2=head2;
	    while(temp1!=null){
	        if(!al.contains(temp1.data)){
	        al.add(temp1.data);}
	        temp1=temp1.next;
	    }
	    while(temp2!=null){
	        if(!al.contains(temp2.data)){
	        al.add(temp2.data);}
	        temp2=temp2.next;
	    }
	    Collections.sort(al);
	    LinkedList<Node> ll=new LinkedList<>();
	    Node head3 = new Node(al.get(0));
	    Node temp3=head3;
	    int i=1;
	    while(i<al.size()){
	        temp3.next=new Node(al.get(i));
	        temp3=temp3.next;
	        i++;
	    }
	    return head3;
	}
}
