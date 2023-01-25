class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:arr)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            set.add(e.getValue());
        }
        return map.size()==set.size();
    }
}