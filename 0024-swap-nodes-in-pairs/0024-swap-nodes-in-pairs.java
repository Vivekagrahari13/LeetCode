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
    public ListNode swapPairs(ListNode head) {
    if(head==null || head.next==null)
        return head;
        ListNode curr=head;
        head=head.next;
        while(curr!=null && curr.next!=null)
        {
            ListNode temp=curr.next.next;
            curr.next.next=curr;
            if(temp!=null &&temp.next!=null)
            {
                curr.next=temp.next;
            }
            else
                curr.next=temp;
            curr=temp;
        }
        return head;
    }
}