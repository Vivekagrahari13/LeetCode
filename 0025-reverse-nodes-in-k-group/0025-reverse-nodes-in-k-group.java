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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode prev=null, next=null, curr=head;
        int i=0;
        while(curr!=null && i<k)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            i++;
        }
        if(next==null && i<k)
        {
           return reverse(prev); 
        }
        if(next!=null)
        {
            ListNode rest_head=reverseKGroup(next,k);
            head.next=rest_head;
        }
        return prev;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null, next=null, curr=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}