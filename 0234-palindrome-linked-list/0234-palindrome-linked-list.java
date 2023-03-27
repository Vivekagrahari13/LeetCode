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
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow=head,fast=head;
        ListNode curr=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow=reverse(slow);
        ListNode temp=slow;
        while(slow!=null)
        {
            if(slow.val==curr.val){
            curr=curr.next;
            slow=slow.next;}
            else
                return false;
            
        }
        return true;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null,next=null,curr=head;
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