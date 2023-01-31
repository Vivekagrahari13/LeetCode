class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getValue()>nums.length/3)
            {
                list.add(e.getKey());
            }
        }
        
        return list;
    }
}