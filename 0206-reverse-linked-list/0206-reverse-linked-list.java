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
    public ListNode reverseList(ListNode head) 
    {
        if(head==null ||head.next==null)
        {
            return head;
        }
        ListNode next1=null, next2=null;
        ListNode curr=head;
        while(curr!=null)
        {
           next1=curr.next;
            curr.next=next2;
            next2=curr;
            curr=next1;
        }
        return next2;
    }
}