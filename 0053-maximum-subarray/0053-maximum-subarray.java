class Solution {
    public int maxSubArray(int[] nums) 
    {
        //Kadane's Algorithm
       int res=nums[0];
        int EndMax=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            EndMax=Math.max(nums[i], nums[i]+EndMax);
            res=Math.max(EndMax, res);
        }
        return res;

    }
}