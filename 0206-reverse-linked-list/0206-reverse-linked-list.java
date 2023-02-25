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
        ListNode curr=head;
        ListNode prev=null;
        return revFun(curr, prev);
    }
    ListNode revFun(ListNode curr, ListNode prev)
    {
        if(curr==null) return prev;
        ListNode next=curr.next;
        curr.next=prev;
        return revFun(next,curr);
    }
}