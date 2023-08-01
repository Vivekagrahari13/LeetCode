class Solution {
    public void rotate(int[] nums, int k) {
        
       int n=nums.length;
        if(n<k)
        {
           k=k%n;
           rotateK(nums, k);
        }
        else
        {
            rotateK(nums,k);
        }
        
    }
    void rotateK(int []nums, int k)
    {
        int n=nums.length;
        reverse(nums, 0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    void reverse(int [] nums, int low, int high)
    {
        while(low<high)
        {
            int temp=nums[low];
            nums[low]=nums[high];
            nums[high]=temp;
            low++;
            high--;
        }
    }
}