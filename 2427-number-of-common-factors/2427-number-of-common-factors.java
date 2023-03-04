class Solution {
    public int commonFactors(int a, int b) {
        int ans=0,i=1;
        while(i<=Math.min(a,b))
        {
            if(a%i==0 && b%i==0)
                ans++;
            i++;
        }
        return ans;
    }
}