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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverseList(l1);
        l2=reverseList(l2);
        
        ListNode sum_head=new ListNode(0);
        ListNode flag=sum_head;
        
        int carry=0;
        while(l1!=null || l2!=null || carry!=0)
        {
            int a=(l1!=null)?l1.val:0;
            int b=(l2!=null)?l2.val:0;
            
            int curr_sum=a+b+carry;
            
            ListNode node=new ListNode(curr_sum%10);
            flag.next=node;
            flag=flag.next;
            
             carry=curr_sum/10;
            
            l1=(l1!=null)?l1.next:null;
            l2=(l2!=null)?l2.next:null;
        }
        sum_head=deleteHead(sum_head);
        sum_head=reverseList(sum_head);
        return sum_head;
    }
    public ListNode reverseList(ListNode head)
    {
        if(head==null || head.next==null) return head;
        ListNode prev=null, next=null;
        ListNode curr=head;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode deleteHead(ListNode head)
    {
        if(head==null) return null;
        return head.next;
    }
}