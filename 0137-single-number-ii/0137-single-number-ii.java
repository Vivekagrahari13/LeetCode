class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer, Integer> e:map.entrySet())
        {
            if(e.getValue()==1)
            {
                ans=e.getKey();
            }
        }
        return ans;
    }
}