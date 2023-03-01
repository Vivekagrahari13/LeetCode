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
        
        //l1=reverseList(l1);
        //l2=reverseList(l2);
        
        ListNode curr1=l1;
        ListNode curr2=l2;
        //ListNode 
        ListNode head_sum=new ListNode(0);
        ListNode flag=head_sum;
        int carry=0;
        
        while(curr1!=null || curr2!=null || carry!=0)
        {
            int a=(curr1!=null)?curr1.val:0;
            int b=(curr2!=null)?curr2.val:0;
            
            int curr_sum=a+b+carry;
            carry=(curr_sum)/10;
            ListNode node=new ListNode(curr_sum%10);
            flag.next=node;
            flag=flag.next;
 
           curr1=(curr1!=null)?curr1.next:null;
           curr2=(curr2!=null)?curr2.next:null;
            
        }
        return head_sum.next;
    }
    /*public ListNode reverseList(ListNode head)
    {
        if(head==null || head.next==null)
        {
            return head;
        } 
        ListNode curr=head;
        ListNode prev=null, next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }*/
}