class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> alone=new ArrayList<>();
        
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            int freq=e.getValue();
            if(freq==1 &&(!map.containsKey(e.getKey()-1)&&!map.containsKey(e.getKey()+1)))
            {
                alone.add(e.getKey());
            }
        }
        return alone;
    }
}