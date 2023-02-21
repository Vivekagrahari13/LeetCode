class Solution {
    public int singleNonDuplicate(int[] nums)
    {
        int bit=0;
        int i=0,j=nums.length-1;
        while(i<j)
        {
            bit=bit^nums[i++]^nums[j--];
        } 
        
        return bit^nums[nums.length/2];
    }
}