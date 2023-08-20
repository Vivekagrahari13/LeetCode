class Solution {
    public int majorityElement(int[] nums) {
        //Setting a Candidate 
        int res=0,count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[res])
                count++;
            else
                count--;
            if(count==0)
            {
                res=i;
                count=1;
            }
        }
        //Selected Candidate have majority or not
        count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[res]==nums[i])
                count++;
        }
        return (count>nums.length/2)?nums[res]:-1;
    }
}