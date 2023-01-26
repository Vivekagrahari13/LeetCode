class Solution {
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer, Integer> map=new HashMap<>();
        //int b[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                nums[i]=-1;
            }
        }
        
        int psum=0,maxlen=0;
        for(int i=0;i<nums.length;i++)
        {
            psum+=nums[i];
            if(psum==0)
            {
                maxlen=i+1;
            }
            if(!map.containsKey(psum))
            {
                map.put(psum,i);
            }
            if(map.containsKey(psum))
            {
                maxlen=Math.max(maxlen,i-map.get(psum));
            }
        }
        return maxlen;
    }
}