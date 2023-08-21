class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0,h=n-1;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[l]<=nums[mid])
            {
                if(nums[l]<=target && target<nums[mid])
                    h=mid-1;
                else
                    l=mid+1;
            }
            else
            {
                if(nums[mid]<target && target<=nums[h])
                    l=mid+1;
                else
                    h=mid-1;
            }
            
        }
        return -1;
    }
}