class Solution {
    public int minimizeMax(int[] a, int p) {
        int n = a.length;
        Arrays.sort(a);
        int l = 0;
        int r = a[n-1]-a[0];
        int mid;
        while(l<r){
            mid = (l+r)/2;
            if(minDiffMax(a, mid, p)>=p) r = mid;
            else l = mid +1;
        }
        return l;
    }
    
    public int minDiffMax(int [] a, int diff, int p){
        int i = 1; int count = 0;
        while(i<a.length){
            if(a[i]-a[i-1]<=diff){
                i++;
                count++;
            }
            i++;
        }
        return count;
    }
}