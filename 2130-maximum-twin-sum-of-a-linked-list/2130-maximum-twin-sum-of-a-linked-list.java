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
    public int pairSum(ListNode head) {
        ListNode slow=head,fast=head,curr=head;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=reverse(slow);
        int max=Integer.MIN_VALUE;
        while(slow!=null)
        {
            int sum=slow.val+curr.val;
            max=Math.max(max,sum);
            slow=slow.next;
            curr=curr.next;
        }
        return max;
    }
    static ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null) return head;
        ListNode prev=null, next=null, curr=head;
        while(curr!=null)
        {
            prev=curr.next;
            curr.next=next;
            next=curr;
            curr=prev;
        }
        return next;
    }
}