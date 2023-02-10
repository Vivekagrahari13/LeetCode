class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        /*int[] flag = new int[1001];
        for(int n : arr1) 
        {
        flag[n]++;
        }
        int i = 0;
        for(int n : arr2) {
            while(flag[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        for(int n = 0; n < flag.length; n++) {
            while(flag[n]-- > 0) {
                arr1[i++] = n;
            }
        }
        return arr1; */
        Arrays.sort(arr1);
        LinkedHashMap<Integer, Integer> map=new LinkedHashMap<>();
        for(int a:arr1)
        {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int k=0;
        for(int b:arr2)
        {
            if(map.containsKey(b)){
                int i=map.get(b);
            while(i>0)
            {
               arr1[k]=b;
                i--;
                k++;
            }
            }
            map.remove(b);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            int i=e.getValue();
            while(i>0)
            {
                arr1[k]=e.getKey();
                i--;
                k++;
            }
        }
        return arr1;
    }
}