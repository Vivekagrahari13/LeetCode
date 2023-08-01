class Solution {
    public int maximumDifference(int[] nums) {
        int diff=nums[1]-nums[0];
        int minValue=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            diff=Math.max(diff,nums[i]-minValue);
            minValue=Math.min(minValue, nums[i]);
        }
        return (isSorted(nums))?-1:diff;
    }
    public boolean isSorted(int []nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                return false;
            }
        }
        return true;
    }
}