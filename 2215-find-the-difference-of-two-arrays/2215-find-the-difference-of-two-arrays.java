class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
     List<List<Integer> > ans= new ArrayList<List<Integer> >();
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
             set2.add(nums2[i]);
        }
        ans.add(new ArrayList<Integer>());
        for(Integer a:set1)
        {
            if(!set2.contains(a))
            {
                ans.get(0).add(a);
            }
        }
        ans.add(new ArrayList<Integer>());
        for(Integer b:set2)
        {
            if(!set1.contains(b))
            {
               
                ans.get(1).add(b);
            }
        }
        return ans;
    }
}