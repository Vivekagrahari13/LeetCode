/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode curr=head;
        Deque<ListNode> stack=new ArrayDeque<>();
        int size=0;
        while(curr!=null)
        {
                size++;
                while(!stack.isEmpty()&&stack.peek().val<curr.val){
                stack.pop();
                
                }
            
            
            stack.push(curr);
            curr=curr.next;
        }
         if(stack.size()==size) 
             return head; 
          
        // ListNode head1=new ListNode(0);
        // ListNode flag=head1;
        ListNode head1=null, tail=null;
        while(!stack.isEmpty())
        {
            ListNode node=new ListNode(stack.peek().val);
            if(head1==null)
            {
                head1=node;
                tail=node;
            }
            else
            {
                ListNode temp=head1;
                head1=node;
                head1.next=temp;
            }
            stack.pop();
        }
        return head1;
    }
}