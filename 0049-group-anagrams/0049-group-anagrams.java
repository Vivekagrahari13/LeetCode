class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String , List<String>> map=new HashMap<>();
        List<List<String>> ga=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            String a=strs[i];
            char []c=a.toCharArray();
            Arrays.sort(c);
            a=new String(c);
            if(!map.containsKey(a))
            {
                map.put(a,new ArrayList<>());
            }
            map.get(a).add(strs[i]);
        }
        for(List<String> value: map.values())
        {
            ga.add(value);
        }
        return ga;
    }
}