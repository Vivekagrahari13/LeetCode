class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=nums[0], index=0;
        for(int i=1;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
                index=i;
            }
        }
        int sum=0;
        for(int i=1;i<=k;i++)
        {
            sum=sum+nums[index];
            nums[index]=nums[index]+1;
        }
        return sum;
    }
}