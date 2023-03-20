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
    //static ListNode prev=null;
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        
        Map<Integer, Integer> map=new LinkedHashMap<>();
        for(ListNode curr=head;curr!=null;curr=curr.next)
        {
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
        }
        ListNode new_head=new ListNode(0);
        ListNode flag=new_head;
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()==1)
            {
                    ListNode temp=new ListNode(e.getKey());
                    flag.next=temp;
                    flag=flag.next;
            }
        }
        return new_head.next;
}
}