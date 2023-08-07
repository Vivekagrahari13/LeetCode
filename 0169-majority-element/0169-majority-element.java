class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer, Integer> map=new HashMap<>();
        for(Integer a: nums)
        {
            map.put(a, map.getOrDefault(a,0)+1);
            if(map.get(a)>(n/2))
            {
                return a;
            }
        }
        return -1;
    }
}