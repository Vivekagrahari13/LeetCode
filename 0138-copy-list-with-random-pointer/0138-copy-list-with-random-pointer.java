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
        HashMap<Node, Node> map=new HashMap<>();
        for(Node curr=head;curr!=null;curr=curr.next)
            map.put(curr,new Node(curr.val));
        for(Node curr=head;curr!=null;curr=curr.next)
        {
            Node clone= map.get(curr);
            clone.next=map.get(curr.next);
            clone.random=map.get(curr.random);
        }
        return map.get(head);
    }
}