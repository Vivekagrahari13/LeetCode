class Solution {
    public int majorityElement(int[] nums)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>(nums.length/2))
            {
                return e.getKey();
            }
        }
        return 0;
    }
}