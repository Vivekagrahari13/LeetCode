class Solution {
    public int findNumbers(int[] nums) 
    {
        int count=0;
        int i=0;
        while(i<nums.length)
        {
            if(((nums[i]+"").length())%2==0)
            {
                count++;
            }
            i++;
        }
        return count;
    }
}