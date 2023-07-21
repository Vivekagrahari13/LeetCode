class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int l=0, h=n-1;
        while(l<=h)
        {
            char a=s[l];
            s[l]=s[h];
            s[h]=a;
            l++;
            h--;
        }
    }
}