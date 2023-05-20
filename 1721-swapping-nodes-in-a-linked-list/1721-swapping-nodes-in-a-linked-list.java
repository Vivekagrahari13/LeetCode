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
        
        int size=0;
        ListNode curr=head;
        while(curr!=null)
        {
            size++;
            curr=curr.next;
        }
        curr=head;
        int i=0;
        while(i<size-k)
        {
            curr=curr.next;
            i++;
        }
        ListNode f=head;
        while(k>1)
        {
            f=f.next;
            k--;
        }
        int temp=f.val;
        f.val=curr.val;
        curr.val=temp;
        
        return head;
    }
}