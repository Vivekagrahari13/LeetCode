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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        ListNode curr=head;
		ListNode temp=head.next;
		while(temp.next!=null)
		{
			if(curr.val!=temp.val)
			{
				curr.next=temp;
				curr=curr.next;
				temp=temp.next;
			}
			else
			{
				temp=temp.next;
			}
		}
		if(curr.val==temp.val)
		{
			curr.next=null;
		}
		else
		{
			curr.next=temp;
			curr=curr.next;
			curr.next=null;
		}
		return head;
    }
}