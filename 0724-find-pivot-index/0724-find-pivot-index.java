class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length, arrSum=0;
        for(int i=0;i<n;i++)
            arrSum+=nums[i];
        int leftSum=0;
        for(int i=0;i<n;i++)
        {
            if(leftSum==arrSum-nums[i])
                return i;
            leftSum+=nums[i];
            arrSum-=nums[i];
        }
        return -1;
    }
}