//By Vivek Agrahari
// using Prefix Sum
class Solution
{
    public int pivotIndex(int[] nums)
    {
        int a_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            a_sum+=nums[i];
        }
        int left_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(left_sum==a_sum-nums[i])
            {
                return i;
            }
            else
            {
                left_sum+=nums[i];
                a_sum=a_sum-nums[i];
            }
        }
        return -1;
    }
}