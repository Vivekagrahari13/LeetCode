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
        
        HashMap<Integer, Integer> map=new HashMap<>();
        for(ListNode curr=head;curr!=null;curr=curr.next)
        {
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            //System.out.println(e.getValue());
            if(e.getValue()==1)
            {
                list.add(e.getKey());
            }
        }
        if(list.isEmpty())
        {
            return null;
        }
        ListNode curr_node=head, final_head=head;
        boolean flag =true;
        while(curr_node!=null)
        {
            if(list.contains(curr_node.val) && flag==true)
            {
                head=curr_node;
                final_head=curr_node;
                flag=false;
            }
            else if(list.contains(curr_node.val) && flag==false)
            {
                head.next=curr_node;
                head=head.next;
            }
            curr_node=curr_node.next;
        }
         head.next=null;
         return final_head;
}
}