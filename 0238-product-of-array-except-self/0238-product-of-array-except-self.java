class Solution {
    public int[] productExceptSelf(int[] nums) {
        int index=0,count=0,n=nums.length,prod=1;
        for(int i=0;i<n;i++)
        {
            int x=nums[i];
            if(x!=0)
            {
                prod=prod*x;
            }
            else
            {
                count++;
                index=i;
            }
        }
        if(count>=2)
        {
            Arrays.fill(nums,0);
        }
        else if(count==1)
        {
            Arrays.fill(nums,0);
            nums[index]=prod;
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                nums[i]=prod/nums[i];
            }
        }
        return nums;
    }
}