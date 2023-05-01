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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr=head;
        int size=0;
        while(curr!=null)
        {
            curr=curr.next; size++;
        }
        int i=size-1;
        curr=head;
        int ans[]=new int[size];
        curr=reverse(head);
        Deque<Integer> stack=new ArrayDeque<>();
        // stack.push(curr.val);
        // ans[i]=0;
        // i--;
        // curr=curr.next;
        while(curr!=null)
        {
            while(!stack.isEmpty()&&stack.peek()<=curr.val)
            {
                stack.pop();
            }
            ans[i]=stack.isEmpty()?0:stack.peek();
            stack.push(curr.val);
            i--;
            curr=curr.next;
        }
        return ans;
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null, next=null, curr=head;
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