/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int c1=getCount(headA);
        int c2=getCount(headB);
        //System.out.println(c2);
        int d;
        if(c1>c2){
            d=c1-c2;
            return getIntersectNode(d,headA,headB);
        }
        else 
        {
             d=c2-c1;
            //System.out.println(d);
            return getIntersectNode(d,headB,headA);
        }
        // else
        // {
        //     d=0;
        //     return getIntersectNode(d,headA,headB);
        // }
    }
    public int getCount(ListNode head)
    {
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }
    public ListNode getIntersectNode(int d,ListNode node1, ListNode node2)
    {
        int i;
        ListNode curr1=node1;
        ListNode curr2=node2;
        for(i=0;i<d;i++)
        {
            if(curr1==null) {
                return null;}
            curr1=curr1.next;
        }
        while(curr1!=null && curr2!=null)
        {
            if(curr1==curr2)
            {
                return curr1;
            }
            curr1=curr1.next;
            curr2=curr2.next;
        }
        return null;
    }
}