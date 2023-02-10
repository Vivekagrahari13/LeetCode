class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] flag = new int[1001];
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
        return arr1;
    }
}