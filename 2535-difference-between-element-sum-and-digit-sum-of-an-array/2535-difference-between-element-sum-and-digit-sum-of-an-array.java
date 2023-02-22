class Solution {
    public int differenceOfSum(int[] nums) 
    {
        int elem_sum=0;
        int dig_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            elem_sum+=nums[i];
            //int n=nums[i];
            while(nums[i]>0)
            {
                dig_sum+=nums[i]%10;
                nums[i]/=10;
            }
        }
        return Math.abs(elem_sum-dig_sum);
    }
}