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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode curr;
        if(head==null || head.next==null) return null;
        for(curr=head;curr!=null;curr=curr.next)
        {
            size++;
        }
        if(size==n)
        {
            head=head.next;
            return head;
        }
        int i=1;
        //int m=size-n+1;
        curr=head;
        while(i<size-n)
        {
            curr=curr.next;
            i++;
        }
        curr.next=curr.next.next;
        return head;
    }
}