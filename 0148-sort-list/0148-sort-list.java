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
    public ListNode sortList(ListNode head) {
        ListNode curr=head;
        List<Integer> list=new ArrayList<>();
        while(curr!=null)
        {
            list.add(curr.val);
            curr=curr.next;
        }
        Collections.sort(list);
        ListNode shead=new ListNode(0);
        ListNode temp=shead;
        for(Integer a:list)
        {
            ListNode curr1=new ListNode(a);
            temp.next=curr1;
            temp=temp.next;
        }
        return shead.next;
    }
}