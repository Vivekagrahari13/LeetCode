class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSub=maxSubarraySumNormal(nums);
        if(maxSub<0)
            return maxSub;
        
        int arrSum=0;
        for(int i=0;i<nums.length;i++)
        {
            arrSum+=nums[i];
            nums[i]=-nums[i];
        }
        int minPart=arrSum+maxSubarraySumNormal(nums);
        int maxSum=Math.max(minPart, maxSub);
        return maxSum;
    }
    public int maxSubarraySumNormal(int [] nums)
    {
        int res=nums[0];
        int maxEnd=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            maxEnd=Math.max(nums[i],maxEnd+nums[i]);
            res=Math.max(maxEnd, res);
        }
        return res;
    }
}