/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        Node curr=head;
        while(curr!=null)
        {
            Node next=curr.next;
            curr.next=new Node(curr.val);
            curr.next.next=next;
            curr=next;
        }
        
        curr=head;
        while(curr!=null)
        {
            if(curr.random!=null)
                curr.next.random=curr.random.next;
           curr=curr.next.next;
        }
        
        curr=head;
        Node head2=head.next;
        Node clone=head2;
        while(clone.next!=null)
        {
            curr.next=curr.next.next;
            clone.next=clone.next.next;
            clone=clone.next;
            curr=curr.next;
            
        }
        curr.next=null;
        clone.next=null;
        return head2;
    }
}