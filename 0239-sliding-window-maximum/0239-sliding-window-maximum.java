class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        for(int i=k;i<n;i++)
        {
            ans[i-k]=nums[dq.getFirst()];
            while(!dq.isEmpty() && dq.peek()<=i-k)
                dq.removeFirst();
            while(!dq.isEmpty() && nums[i]>=nums[dq.getLast()])
                  {
                      dq.removeLast();
                  }
                  dq.addLast(i);
        }
                  ans[n-k]=nums[dq.getFirst()];
        return ans;
    }
}