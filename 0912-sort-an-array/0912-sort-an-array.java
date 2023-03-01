class Solution
 {
     //Using Merge Sort
    public int[] sortArray(int[] nums)
     {
         //Leetcode inbuilt function
        int [] sort=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        mergeSort(nums,l,r);
        for(int i=0;i<nums.length;i++)
        {
            sort[i]=nums[i];
        }
        return sort;
    }
    static void mergeSort(int [] nums, int l, int r)
    {
        if(r>l)
        {
            int mid=l+(r-l)/2;
            mergeSort(nums,l,mid);
            mergeSort(nums,mid+1,r);
            merge(nums,l,mid,r);

        }
    }
    static void merge(int [] nums, int low, int mid, int high){
        int n1=mid-low+1,n2=high-mid;
        int [] left=new int[n1];
        int [] right=new int[n2];
        for(int i=0;i<n1;i++)
        {
            left[i]=nums[low+i];
        }
        for(int i=0;i<n2;i++)
        {
            right[i]=nums[mid+i+1];
        }

        int i=0,j=0,k=low;
        while(i<n1&&j<n2)
        {
            if(left[i]<=right[j])
            {
                nums[k++]=left[i++];
            }
            else{
                nums[k++]=right[j++];
            }
        }
        while(i<n1)
        {
            nums[k++]=left[i++];
        }
        while(j<n2)
        {
            nums[k++]=right[j++];
        }
    }
}