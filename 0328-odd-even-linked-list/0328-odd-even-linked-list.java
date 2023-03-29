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
    public ListNode oddEvenList(ListNode head) {
        ListNode es=null,ee=null,os=null,oe=null;
        ListNode curr=head;
        if(head==null || head.next==null) return head;
        int count=1;
        while(curr!=null)
        {
            if(count%2!=0)
            {
                if(os==null)
                {
                    os=oe=curr;
                }
                else
                {
                    oe.next=curr;
                    oe=oe.next;
                }
            }
            else
            {
                if(es==null)
                    es=ee=curr;
                else
                {
                    ee.next=curr;
                    ee=ee.next;
                }
            }
            count++;
            curr=curr.next;
        }
        oe.next=es;
        ee.next=null;
        return os;
    }
}