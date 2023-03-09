class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
                list.add(e.getValue());
        }
        Collections.sort(list);
        int j=list.size()-1;
        int temp[]=new int[k];
        for(int i=0;i<temp.length;i++){
            for(Map.Entry<Integer,Integer>e:map.entrySet()){
                if(list.get(j)==e.getValue()){
                    temp[i]=e.getKey();
                    map.remove(e.getKey());
                    j--;
                    break;
                }
            }
        }
        return temp;
    }
}