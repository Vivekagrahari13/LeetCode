class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> list=new LinkedList<>();
        int i=num.length-1, carry=0;
        while(i>=0 || k>0 || carry!=0)
        {
            int f=(i>=0?num[i]%10:0);
            int s=(k>0?k%10:0);
            int curr_sum=(f+s+carry);
            list.addFirst((curr_sum)%10);
            carry=curr_sum/10;
            i--;
            k=k/10;
        }
        return list;
    }
}