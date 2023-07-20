class Solution {
    public int maxSubArray(int[] nums) {
        int lar_sum=nums[0];
        int maxEnd=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int curr_sum=nums[i]+maxEnd;
            maxEnd=Math.max(nums[i],curr_sum);
            lar_sum=Math.max(maxEnd, lar_sum);
        }
        return lar_sum;
    }
}