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
    public ListNode swapNodes(ListNode head, int k) {
        //for first pointer 
        ListNode p1=head,p2=head,curr=head;
        int size=0;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        }
        // Moving pointer p1 to starting kth node
        int start=1;
        while(start<k)
        {
            p1=p1.next;
            start++;
        }
        //Now moving pointer p2 to the kth node from end of list
        start=0;
        while(start<size-k)
        {
           start++;
           p2=p2.next;
        }
        //Now swapping kth form beginninh and ending
        int temp=p1.val;
        p1.val=p2.val;
        p2.val=temp;
        
        return head;
    }
}