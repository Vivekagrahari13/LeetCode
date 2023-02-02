class Solution {
    public int[] arrayRankTransform(int[] arr) 
    {
        int rank[]=new int[arr.length];
        
        for(int i=0;i<arr.length;i++)
        {
           rank[i]=arr[i]; 
        }
            
        Arrays.sort(arr);
        int x=0;
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],++x);
            }
            
        }
        
        for(int i=0;i<arr.length;i++)
        {
            //int r=rank[i];
            if(map.containsKey(rank[i]))
            {
               rank[i]=map.get(rank[i]);
            }
        }
        return rank;
    }
}