class Solution {
    public int arraySign(int[] nums) {
        long prod=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0) return 0;
            else if(nums[i]<0)
            {
                nums[i]=-1;
                prod*=nums[i];
            }
            else 
            {
                nums[i]=1;
                prod*=nums[i];
            }
        }
        return (prod<0)?-1:1;
    }
}