class Solution {
    public int search(int[] nums, int target) {
       int low=0,high=nums.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            //Since Rotated array so sorted array divide in two parts left and right sorted
            // For Left Sorted Array
            if(nums[mid]>=nums[low])
            {
                if(target<nums[mid] && target>=nums[low])
                    high=mid-1;
                else
                    low=mid+1;     
            }
            // For Right Sorted Array
            if(nums[mid]<=nums[high])
            {
                if(target>nums[mid]&& target<=nums[high])
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return -1;
    }
}