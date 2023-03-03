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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) 
            return null;
        ListNode first=head,second=first;
       
        while(first!=null && first.val==val)
        {
            head=first.next;
            first=head;
        }
        while(first!=null)
        {
            if(first.val==val)
            {
                second.next=first.next;
                first=second.next;
            }
            else
            {
                second=first;
                first=first.next;
            }
        }
        return head;
        
    }
}