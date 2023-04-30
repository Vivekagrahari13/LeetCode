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
    public void reorderList(ListNode head) {
        if(head.next==null) return ;
        ListNode curr=head,s=head, f=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
        }
        ListNode rev=reverse(s);
       ListNode curr1=rev;
        
        while(rev!=null)
        {
            ListNode temp=curr.next;
            curr.next=rev; 
            rev=rev.next;
            if(temp==s && (rev==null || rev.next==null))
            {
                break;
            }
            curr.next.next=temp;
            curr=temp;
            if(curr==s)
            {
                break;
            }
        }
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null, next=null,curr=head;
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