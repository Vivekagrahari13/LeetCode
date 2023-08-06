class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0], maxEnd=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res=Math.max(res+nums[i],nums[i]);
            maxEnd=Math.max(maxEnd, res);
        }
        return maxEnd;
    }
}