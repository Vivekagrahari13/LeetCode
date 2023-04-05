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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode hm=new ListNode(0);
        ListNode flag=hm;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                flag.next=list1;
                flag=flag.next;
                list1=list1.next;
            }
            else
            {
                flag.next=list2;
                flag=flag.next;
                list2=list2.next;
            }
        }
        while(list1!=null)
        {
            flag.next=list1;
                flag=flag.next;
                list1=list1.next;
        }
        while(list2!=null)
        {
            flag.next=list2;
                flag=flag.next;
                list2=list2.next;
        }
        return hm.next;
    }
}