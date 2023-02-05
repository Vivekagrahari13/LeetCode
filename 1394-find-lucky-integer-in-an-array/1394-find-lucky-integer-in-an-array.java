class Solution {
    public int findLucky(int[] arr) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int max=-1;
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            if(e.getKey()==e.getValue())
            {
                 max=Math.max(max,e.getKey());
            }
        }
        return max;
    }
}