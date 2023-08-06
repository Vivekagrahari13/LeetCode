class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res=0, count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
                count++;
            else
            {
                res=Math.max(count, res);
                count=0;
            }
        }
        res=Math.max(res,count);
        return res;
    }
}